import java.awt.*;
import java.applet.*;

public class Hoofdstuk2 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Benjamin!!", 50, 60 );
    }
}