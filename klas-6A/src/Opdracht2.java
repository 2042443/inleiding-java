import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Benjamin!!", 50, 60);
        g.setColor(Color.red);
        g.drawString("Da Costa Gomez!!", 50, 80);
    }
}
