/**
 * Created by Benjamin on 29-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10_4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, tekst;
    String b, tekst2;
    String c, tekst3;
    int maand,jaar,schrikkel,schrikkelfalse;

    public void init() {
        tekstvak = new TextField("", 20);  //maand
        tekstvak2 = new TextField("", 20 ); //Jaar
        label = new Label("Type het maandnummer en het jaar & druk op enter");
        tekstvak.addActionListener( new TekstvakListener());
        tekstvak2.addActionListener( new TekstvakListener());
        tekst = "";
        tekst2= "";
        tekst3= "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString("Maand: "+tekst, 80, 80 );
        g.drawString("Dagen: "+tekst2,80, 100 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            c = (tekstvak2.getText ());
            maand = Integer.parseInt( s);
            jaar =Integer.parseInt ( c);
            schrikkel= jaar%4;
            schrikkelfalse= jaar%400;
            switch(maand) {
                case 1:
                    tekst = "Januari";
                    tekst2 = "31";
                    break;
                case 2:
                    tekst = "Februari";
                    if (schrikkel == 0 &&!(schrikkelfalse ==0)){
                    tekst2 = "29 (schrikkeljaar)";
                    }
                    else{

                tekst2 = "28";
                        tekst3 = "Ja";
            }
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