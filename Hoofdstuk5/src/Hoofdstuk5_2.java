package H4;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Hoofdstuk5_2 extends Applet {

    int valerie;
    int Jeroen;
    int Hans;
    int gewichtJ;
    int gewichtH;
    int gewichtV;
    Button Knop1;
    TextField J;
    TextField H;
    TextField V;



    public void init() {
        //staaf
        gewichtJ = 100;
        gewichtH = 100;
        gewichtV = 100;
        J = new TextField();
        V = new TextField();
        H = new TextField();
        Knop1 = new Button("OK");
        Listen l1 = new Listen();
        Knop1.addActionListener(l1);
        add(V);
        add(J);
        add(H);
        add(Knop1);

    }
class Listen implements ActionListener{
    public void actionPerformed(ActionEvent e){
        gewichtH = Integer.parseInt(H.getText());
        gewichtV = Integer.parseInt(V.getText());
        gewichtJ = Integer.parseInt(J.getText());
        repaint();
    }
}
    public void paint(Graphics g) {
        g.drawString("valerie",110,210);
        g.drawString(""+gewichtV,110,220);
        g.drawString("Jeroen",160,210);
        g.drawString(""+gewichtJ,160,220);
        g.drawString("Hans",210,210);
        g.drawString(""+gewichtH,210,220);
        g.drawLine(80,200,260,200);
        g.drawLine(80,200,80,50);
        g.drawString("20 KG__",33,180);
        g.drawString("40 KG__",33,160);
        g.drawString("60 KG__",33,140);
        g.drawString("80 KG__",33,120);
        g.drawString("100 KG__",26,100);
        g.drawString("120 KG__",26,80);
        g.setColor(Color.RED);
        g.fillRect(110,200-gewichtV,40,gewichtV);
        g.setColor(Color.GRAY);
        g.fillRect(160,200-gewichtJ,40,gewichtJ);
        g.setColor(Color.BLUE);
        g.fillRect(210,200-gewichtH,40,gewichtH);


    }
}