/**
 * Created by Benjamin on 30-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10_5 extends Applet
{
    double newc, gem, gemc, cijfer;
    Button new1;
    TextField vak1;
    public void init()
    {
        setSize(300,300);
        vak1 = new TextField("",10);
        gem = 0;
        newc = 0;
        cijfer = 0;

        Listen1 nb = new Listen1();
        new1 = new Button("Ok");
        new1.addActionListener(nb);
        add(new1);
        add(vak1);
    }
    public void paint(Graphics g)
    {
        if (gemc>5.4 && gemc<10.1)
        {
            g.drawString("U bent geslaagd", 100, 200);
        }

        if (gemc < 5.5)
        {
            g.drawString("U bent gezakt", 100, 200);
        }

        g.drawString("uw gemiddelde is: "+(String.format("%.2f", Double.valueOf(gemc))), 100, 180);
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            newc = Double.parseDouble(vak1.getText());
            gem++;
            cijfer = cijfer + newc;
            gemc = cijfer/gem;
            repaint();
        }
    }

}
