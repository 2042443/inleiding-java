/**
 * Created by Benjamin on 20-9-2016.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Hoofdstuk8_2 extends Applet {
    int man, vrouw, mleerling, vleerling;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void init() {
        //begin aantallen
        man = 0;
        vrouw = 0;
        mleerling = 0;
        vleerling = 0;
        //buttons en opdrachten
        Listen1 M = new Listen1();
        Listen2 V = new Listen2();
        Listen3 ML = new Listen3();
        Listen4 VL = new Listen4();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        //labels voor button en acties die moeten worden uitgevoerd
        button1.setLabel("Man volwassen");
        button2.setLabel("Vrouw Volwassen");
        button3.setLabel("man leerling");
        button4.setLabel("vrouw leerling");
        button1.addActionListener(M);
        button2.addActionListener(V);
        button3.addActionListener(ML);
        button4.addActionListener(VL);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    public void paint(Graphics g)
    {
        g.drawString("Mannen Volwassen: "+man, 30, 120);
        g.drawString("Vrouwen Volwassen: "+vrouw, 30, 140);
        g.drawString("Mannen Leerling: "+mleerling, 30, 160);
        g.drawString("Vrouwen Leerling" +vleerling, 30, 180);

    }
        class Listen1 implements ActionListener
        {

            public void actionPerformed(ActionEvent a) {
                man++;
                repaint();
            }
        }
        class Listen2 implements ActionListener
        {

            public void actionPerformed(ActionEvent b)
            {
                vrouw++;
                repaint();
            }
        }
        class Listen3 implements ActionListener
        {
            public void actionPerformed( ActionEvent c)
            {
                mleerling++;
                repaint();
            }
        }
        class Listen4 implements ActionListener
        {
            public void actionPerformed( ActionEvent d)
            {
                vleerling++;
                repaint();
            }
        }


}
