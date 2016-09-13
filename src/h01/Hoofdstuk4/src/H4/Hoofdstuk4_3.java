package H4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       g.setColor(Color.black);
        g.fillRect(100,100,10,300);
        g.setColor(Color.red);
        g.fillRect(110,100,200,50);
        g.setColor(Color.black);
        g.drawRect(109,150,200,50);
        g.setColor(Color.blue);
        g.fillRect(110,200,200,50);

    }
}
