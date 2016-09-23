/**
 * Created by Benjamin on 23-9-2016.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Rekenmachine extends Applet
{
    TextField vak1;
    TextField vak2;
    Button gedeeld1;
    Button keer1;
    Button plus1;
    Button Min1;
    Button ce1;
    double waarde1;
    double waarde2;

    public void init()
    {
        vak1 = new TextField(10);
        vak2 = new TextField(10);
        ce1 = new Button();	//clear button
        gedeeld1 = new Button();	//divide button
        keer1 = new Button();	//multiply button
        plus1 = new Button();	//plus button
        Min1 = new Button();	//minus button
        ce1.setLabel("Ce");
        gedeeld1.setLabel("/");
        keer1.setLabel("X");
        plus1.setLabel("+");
        Min1.setLabel("-");
        listen1 minus = new listen1();
        listen2 plus = new listen2();
        listen3 div = new listen3();
        listen4 mult = new listen4();
        listen5 ce = new listen5();
        plus1.addActionListener(plus);
        Min1.addActionListener(minus);
        gedeeld1.addActionListener(div);
        keer1.addActionListener(mult);
        ce1.addActionListener(ce);
        add(vak1);
        add(vak2);
        add(ce1);
        add(plus1);
        add(Min1);
        add(keer1);
        add(gedeeld1);
    }
    class listen1 implements ActionListener	//minus button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1-waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen2 implements ActionListener //plus button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1+waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen3 implements ActionListener //divide button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1/waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen4 implements ActionListener //multiply button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1*waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen5 implements ActionListener //clear button
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            vak2.setText(null);
            repaint();
        }
    }


}
