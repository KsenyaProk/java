import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonToShow extends JFrame {
    public ButtonToShow(){
        setTitle("Кнопка");
        //определить поведение при нажатии на крестик
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        JButton ok = new JButton("Нажмите, чтобы открыть картинку");
        add(ok, BorderLayout.CENTER);
        setVisible(true);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Картинка Гусеничка");
                frame.getContentPane().add(new MyGraphics());
                frame.setSize(600,400);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        System.out.println("Позиция мыши: ("+e.getX()+", "+e.getY()+')');
                    }
                });
            }
        });
    }
}
