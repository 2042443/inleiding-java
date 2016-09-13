package H4;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(200,200,300,300,50,50);
        g.setColor(Color.black);
        g.fillOval(240,240,70,70);
        g.fillOval(390,240,70,70);
        g.fillOval(240,390,70,70);
        g.fillOval(390,390,70,70);
    }
}