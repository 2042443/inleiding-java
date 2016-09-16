/**
 * Created by Benjamin on 15-9-2016.
 */

import java.awt.*;
import java.applet.*;


public class Hoofdstuk6_2 extends Applet {
    int a, b, c, d;
    int uitkomsta;
    int uitkomstb;
    int uitkomstc;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomsta = a*b;
        uitkomstb = (a*b)*c;
        uitkomstc =((a*b)*c)*d;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur : " + uitkomsta, 20, 20);
        g.drawString("Seconden in een dag : " + uitkomstb, 20, 40);
        g.drawString("Seconden in een jaar: " + uitkomstc, 20, 60);
    }
}