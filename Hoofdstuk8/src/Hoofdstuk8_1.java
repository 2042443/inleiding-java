/**
 * Created by Benjamin on 16-9-2016.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Hoofdstuk8_1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;
    String text;


    public void init() {
        Listen1 ok = new Listen1();
        Listen2 re = new Listen2();
        text ="";
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        knop1= new Button("ok");
        knop2= new Button("Reset");
        knop1.addActionListener(ok);
        knop2.addActionListener(re);
        add(tekstvak);
        add(knop1);
        add(knop2);
    }
    public void paint(Graphics g){
        g.drawString(text,50,50);
    }
    public class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            repaint();
        }
    }
        public class Listen2 implements ActionListener{
                    public void actionPerformed(ActionEvent e){
                        text = "";
                        repaint();
            }
        }
}