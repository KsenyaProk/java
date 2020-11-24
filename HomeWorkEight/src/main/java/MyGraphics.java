import javax.swing.*;
import java.awt.*;

public class MyGraphics extends JPanel {
    public void paint(Graphics g){
        //картинка гусеницы
        Color lightBlue=new Color(19, 232, 223);
        g.setColor(lightBlue);
        //небо
        g.fillRect(0, 0, 600, 200);

        Color green=new Color(0, 134, 29);
        g.setColor(green);
        //травка
        g.fillRect(0, 200, 1000, 500);
        g.fillOval(0, 150, 2000, 500);


        Color yellow=new Color(255, 200, 0);
        g.setColor(yellow);
        //солнышко
        g.fillOval(-10, -10, 100, 100);
        //лучики
        g.drawLine(50, 50, 130, 100);
        g.drawLine(50, 30, 150, 30);
        g.drawLine(30, 40, 30, 150);

        Color brown=new Color(69, 60, 43);
        g.setColor(brown);
        //ножки
        g.drawLine(120,270,110,320);
        g.fillOval(110, 310, 20, 15);
        g.drawOval(110, 310, 20, 15);
        g.drawLine(130, 270, 140, 310);
        g.fillOval(140, 300, 20, 15);
        g.drawOval(140, 300, 20, 15);

        g.drawLine(180, 260, 170, 310);
        g.fillOval(170, 300, 20, 15);
        g.drawOval(170, 300, 20, 15);
        g.drawLine(190, 260, 200, 300);
        g.fillOval(200, 290, 20, 15);
        g.drawOval(200, 290, 20, 15);

        g.drawLine(240, 250, 230, 300);
        g.fillOval(230, 290, 20, 15);
        g.drawOval(230, 290, 20, 15);
        g.drawLine(250, 250, 260, 290);
        g.fillOval(260, 280, 20, 15);
        g.drawOval(260, 280, 20, 15);

        g.drawLine(300, 250, 290, 300);
        g.fillOval(290, 290, 20, 15);
        g.drawOval(290, 290, 20, 15);
        g.drawLine(310, 250, 320, 290);
        g.fillOval(320, 280, 20, 15);
        g.drawOval(320, 280, 20, 15);

        g.drawLine(360, 250, 350, 295);
        g.fillOval(350, 285, 20, 15);
        g.drawOval(350, 285, 20, 15);
        g.drawLine(370, 250, 380, 285);
        g.fillOval(380, 275, 20, 15);
        g.drawOval(380, 275, 20, 15);

        //рожки
        g.drawLine(430, 160, 420, 100);
        g.fillOval(410, 100, 20, 20);
        g.drawOval(410, 100, 20, 20);
        g.drawLine(450, 160, 470, 100);
        g.fillOval(460, 100, 20, 20);
        g.drawOval(460, 100, 20, 20);

        //кружочки тело
        g.setColor(yellow);
        g.fillOval(90, 200, 80, 80);
        g.setColor(brown);
        g.drawOval(90, 200, 80, 80);
        g.setColor(yellow);
        g.fillOval(150, 190, 80, 80);
        g.setColor(brown);
        g.drawOval(150, 190, 80, 80);
        g.setColor(yellow);
        g.fillOval(210, 180, 80, 80);
        g.setColor(brown);
        g.drawOval(210, 180, 80, 80);
        g.setColor(yellow);
        g.fillOval(270, 180, 80, 80);
        g.setColor(brown);
        g.drawOval(270, 180, 80, 80);
        g.setColor(yellow);
        g.fillOval(330, 175, 80, 80);
        g.setColor(brown);
        g.drawOval(330, 175, 80, 80);
        g.setColor(yellow);
        g.fillOval(400, 150, 80, 80);//голова
        g.setColor(brown);
        g.drawOval(400, 150, 80, 80);

        //лицо
        //Глаза
        g.setColor(lightBlue);
        g.fillOval(420, 170, 20, 18);
        Color white=new Color(255, 255, 255);
        g.setColor(white);
        g.fillOval(423, 173, 5, 5);
        g.setColor(lightBlue);
        g.fillOval(442, 170, 20, 18);
        g.setColor(white);
        g.fillOval(445, 173, 5, 5);
        Color red=new Color(255, 25, 25);
        g.setColor(red);
        //рот
        g.drawLine(420, 210, 460, 210);
    }
}
