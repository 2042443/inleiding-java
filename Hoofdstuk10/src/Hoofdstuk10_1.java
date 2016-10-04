/**
 * Created by Benjamin on 27-9-2016.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;



public class Hoofdstuk10_1 extends Applet {

TextField tekstvak1;
Label label;
String s, tekst;
long cijfer1, cijfer2;

        public void init() {
                tekstvak1 = new TextField("", 20);
                label = new Label("typ jew getal ");
                tekstvak1.addActionListener(new Vaklisten());
                add(label);
                add(tekstvak1);
        }
        public void paint(Graphics g) {
        g.drawString (cijfer1+"",50,90);
        }

        class Vaklisten implements ActionListener
        {
              public void actionPerformed (ActionEvent b)
              {

                      cijfer2=Long.parseLong(tekstvak1.getText());
                              if ((cijfer2>cijfer1))
                              {
                                      cijfer1 = cijfer2;
                                      tekstvak1.setText(null);
                                      repaint();
                              }
              }

        }
}

