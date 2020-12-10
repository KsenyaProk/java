import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {

    public Chat(){
        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,500,500);

        //верхняя панель
        JPanel jpCenter = new JPanel();
        add(jpCenter,BorderLayout.CENTER);
        jpCenter.setLayout(new BorderLayout());

        //нижняя панель
        JPanel jpBottom = new JPanel();
        add(jpBottom,BorderLayout.SOUTH);
        jpBottom.setLayout(new BorderLayout());

        JTextArea field = new JTextArea();
        jpCenter.add(field,BorderLayout.CENTER);
        JButton send = new JButton("Отправить");
        jpBottom.add(send,BorderLayout.EAST);
        JTextField message = new JTextField();
        jpBottom.add(message,BorderLayout.CENTER);

        field.setEditable(false);

        message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append(" "+message.getText()+"\n");
                message.setText("");
            }
        });

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append(" "+message.getText()+"\n");
                message.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
    }
}
