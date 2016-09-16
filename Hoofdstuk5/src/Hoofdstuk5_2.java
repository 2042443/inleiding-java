package H4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk5_2 extends Applet {

    int valerie;
    int Jeroen;
    int Hans;
    int gewichta;
    int gewichtb;
    int gewichtc;


    public void init() {
        Jeroen = 100;
        Hans = 120;
        valerie = 160;
        //staaf
        gewichta = 100;
        gewichtb = 80;
        gewichtc = 40;
    }

    public void paint(Graphics g) {
        g.drawString("valerie",110,210);
        g.drawString("40 KG",110,220);
        g.drawString("Jeroen",160,210);
        g.drawString("100 KG",160,220);
        g.drawString("Hans",210,210);
        g.drawString("80 KG",210,220);
        g.drawLine(80,200,260,200);
        g.drawLine(80,200,80,50);
        g.drawString("20 KG__",33,180);
        g.drawString("40 KG__",33,160);
        g.drawString("60 KG__",33,140);
        g.drawString("80 KG__",33,120);
        g.drawString("100 KG__",26,100);
        g.drawString("120 KG__",26,80);
        g.setColor(Color.RED);
        g.fillRect(110,valerie,40,gewichtc);
        g.setColor(Color.GRAY);
        g.fillRect(160,Jeroen,40,gewichta);
        g.setColor(Color.BLUE);
        g.fillRect(210,Hans,40,gewichtb);

    }
}