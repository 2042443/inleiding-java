/**
 * Created by Benjamin on 23-9-2016.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk8_3 extends Applet {
    Label label;
    TextField vak1;
    Button buttonok;
    Button buttonreset;
    double btw;
    double bedrag;
    String b;
public void init(){
    //variabelen
    btw=1.21;
    //objecten
    vak1= new TextField ("",20);
    label= new Label("€");
    buttonok= new Button();
    buttonreset= new Button();
    buttonok.setLabel("Ok");
    buttonreset.setLabel("Reset");
    add(vak1);
    add(label);
    add(buttonok);
    add(buttonreset);
    listen1 ok=new listen1();
    listen2 reset=new listen2();
    listen3 vak=new listen3();
    buttonok.addActionListener(ok);
    buttonreset.addActionListener(reset);
    vak1.addActionListener(vak);
    }

    class listen1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            bedrag= Double.parseDouble(vak1.getText());
            bedrag=bedrag*btw;
            vak1.setText(String.format("%.2f", Double.valueOf(bedrag)));
            repaint();
        }
    }
    class listen2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        vak1.setText(null);
        repaint();
    }
}
class listen3 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        bedrag = Double.parseDouble(vak1.getText());
        bedrag = bedrag * btw;
        vak1.setText(String.format("%.2f", Double.valueOf(bedrag)));
        repaint();

    }
    }
}