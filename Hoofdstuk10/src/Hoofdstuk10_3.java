import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10_3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    String b, tekst2;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2= "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Maand: "+tekst, 80, 80 );
        g.drawString("Dagen: "+tekst2,80, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari";
                    tekst2 = "31";
                    break;
                case 2:
                    tekst = "Februari";
                    tekst2 = "28";
                    break;
                case 3:
                    tekst = "Maart";
                    tekst2 ="31";
                    break;
                case 4:
                    tekst = "April";
                    tekst2 ="30";
                    break;
                case 5:
                    tekst = "Mei";
                    tekst2 = "31";
                    break;
                case 6:
                    tekst = "Juni";
                    tekst2 = "30  ";
                    break;
                case 7:
                    tekst = "Juli";
                    tekst2 = "31";
                    break;
                case 8:
                    tekst = "Augustus";
                    tekst2 = "31";
                    break;
                case 9:
                    tekst = "September";
                    tekst2 = "30";
                    break;
                case 10:
                    tekst = "Oktober";
                    tekst2 = "31";
                    break;
                case 11:
                    tekst = "November";
                    tekst2 = "30 ";
                    break;
                case 12:
                    tekst = "December";
                    tekst2 = "31";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}