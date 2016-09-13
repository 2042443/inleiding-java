package H4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRoundRect(50,50,100,260,50,50);
        g.setColor(Color.red);
        g.fillOval(60,55,80,80);
        g.setColor(Color.orange);
        g.fillOval(60,140,80,80);
        g.setColor(Color.green);
        g.fillOval(60,225,80,80);

    }
}