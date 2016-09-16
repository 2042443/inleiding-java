/**
 * Created by Benjamin on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Hoofdstuk6_3 extends Applet {
    double a, b, uitkomst;


    public void init() {
        a = 2.9;
        b = 29;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("2.9+29: -" + uitkomst, 20, 20);
    }
}