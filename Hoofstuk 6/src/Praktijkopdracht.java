/**
 * Created by Benjamin on 15-9-2016.
 */
import java.awt.*;
        import java.applet.*;


public class Praktijkopdracht extends Applet {
    int  d;
    double uitkomst,a,b,c,e,f;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 10;
        e = 3;
        f = 10;
        uitkomst =Math.round(((a + b + c)/e) *d)/f;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}