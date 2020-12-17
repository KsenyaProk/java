import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Thread thread=null;
        try (Socket socket = new Socket(SERVER_ADDR, SERVER_PORT)) {
            System.out.println("Клиент подключен");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            thread = runThread(in);
            runOutputLoop(out);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (thread != null) thread.interrupt();
        }
    }

    private static void runOutputLoop(DataOutputStream out)throws IOException{
        Scanner scanner = new Scanner(System.in);
        while (true){
            String message = scanner.next();
            out.writeUTF(message);
            if (message.equals("/end")){
                break;
            }
        }
    }

    private static Thread runThread(DataInputStream in){
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                try {
                    String message = in.readUTF();
                    System.out.println("Server: "+message);
                    if (message.equals("/end")){
                        System.out.println("Подключение остановлено сервером");
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
