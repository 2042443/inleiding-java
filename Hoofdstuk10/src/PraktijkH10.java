/**
 * Created by Benjamin on 04-10-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkH10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    String b, tekst2;
    int Cijfer;

    public void init() {
        tekstvak = new TextField("", 20);  //maand
        label = new Label("Typ je Cijfer");
        tekstvak.addActionListener( new TekstvakListener());
        tekst = "";
        tekst2= "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Type Cijfer: "+tekst, 80, 80 );
        g.drawString("Je Cijfer: "+tekst2,80, 100 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Cijfer = Integer.parseInt( s);
            switch(Cijfer) {
                case 1:
                    tekst = "Slechte Cijfer";
                    tekst2 = "1";
                    break;
                case 2:
                    tekst = "Slechte Cijfer";
                    tekst2 = "2";
                    break;
                case 3:
                    tekst = "Slechte Cijfer";
                    tekst2 ="3";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    tekst2 ="4";
                    break;
                case 5:
                    tekst = "Matig";
                    tekst2 = "5";
                    break;
                case 6:
                    tekst = "Voldoende";
                    tekst2 = "6";
                    break;
                case 7:
                    tekst = "Voldoende";
                    tekst2 = "7";
                    break;
                case 8:
                    tekst = "Voldoende";
                    tekst2 = "8";
                    break;
                case 9:
                    tekst = "Goed";
                    tekst2 = "9";
                    break;
                case 10:
                    tekst = "Goed";
                    tekst2 = "10";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}