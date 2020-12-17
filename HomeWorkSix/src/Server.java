import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static final int SERVER_PORT = 8189;

    public static void main(String[] args) throws IOException {
        int port = SERVER_PORT;
        if (args.length != 0){
            port = Integer.parseInt(args[0]);
        }
        new Server().start(port);
    }

    public void start(int port) throws IOException{
        ServerSocket socket = null;
        Socket clientSocket = null;
        Thread thread = null;
        try {
            socket = new ServerSocket(port);
            System.out.println("Сервер подключен");
            clientSocket = socket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            thread = runThread(in);
            runOutputLoop(out);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (thread != null) thread.interrupt();
            if (clientSocket != null) clientSocket.close();
            if (socket != null) socket.close();
        }
    }

    private void runOutputLoop(DataOutputStream out) throws IOException{
        Scanner scanner=new Scanner(System.in);
        while (true){
            String message = scanner.next();
            out.writeUTF(message);
            if (message.equals("/end")){
                break;
            }
        }
    }

    private Thread runThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                try {
                    String message = in.readUTF();
                    System.out.println("Client: "+message);
                    if (message.equals("/end")){
                        System.out.println("Подключение остановлено клиентом");
                        System.exit(0);
                    }
                }catch (IOException e){
                System.out.println("Подключение остановлено");
                break;
            }
        }
    });
        thread.start();
        return thread;

    }
}
