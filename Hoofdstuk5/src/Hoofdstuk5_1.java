import java.awt.*;
import java.applet.*;

public class Hoofdstuk5_1 extends Applet {
    int breedte;
    int lengte;
    Color kleur;


    public void init() {
        breedte= 285;
        lengte= 100;
       kleur= Color.MAGENTA;
    }

    public void paint(Graphics g) {
        //De LIJN
        g.drawLine(20,20,300,20);
        g.drawString("Lijn",160,40);
        //Rechthoek
        g.drawRect(20,50,breedte,lengte);
        g.drawString("Rechthoek",135,165);
        //Afgeronde Rechthoek
        g.drawRoundRect(20,175,breedte,lengte,30,30);
        g.drawString("Afgeronde Rechthoek",105,292);
        //Gevulde Rechthoekje ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(350,50,breedte,lengte);
        g.setColor(Color.black);
        g.drawOval(350,50,breedte,lengte);
        g.drawString("Gevulde Rechthoek met ovaal",410,165);
        //Gevulde Ovaal \
        g.setColor(Color.magenta);
        g.fillOval(350,170,300,100);
        g.setColor(Color.black);
        g.drawString("gevulde Ovaal",460,292);
        // Taartpunt met ovaal
        g.drawOval(700,50,300,100);
        g.setColor(Color.magenta);
        g.fillArc(700,50,300,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met Ovaal eromheen",775,165);
        // Cirkel
        g.drawOval(800,180,100,100);
        g.drawString("Cirkel",835,292);
    }

}