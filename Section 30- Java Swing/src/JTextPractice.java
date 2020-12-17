import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;

class JtextFrame extends JFrame
{
    JTextField tf1;
    JFormattedTextField  tf2,tf3,tf4;

    public JtextFrame()
    {
        super("Swing Text Demo");
        setLayout(new FlowLayout());

        tf1=new JTextField(15);

        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        tf2=new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);


        NumberFormat nf=NumberFormat.getNumberInstance(Locale.US);
        NumberFormatter nbf=new NumberFormatter(nf);
        tf3=new JFormattedTextField(nbf);
        nbf.setAllowsInvalid(false);
        nbf.setMaximum(10000);
        tf3.setColumns(15);
        tf3.setValue(0);


        NumberFormat currency=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter currNumFormatter=new NumberFormatter(currency);
        tf4=new JFormattedTextField(currNumFormatter);
        currNumFormatter.setAllowsInvalid(false);
        currNumFormatter.setMaximum(10000000);
        tf4.setColumns(15);
        tf4.setValue(0);

        JTextArea ta=new JTextArea(5,15);

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(ta);
    }
}

public class JTextPractice {
    public static void main(String[] args) {
        JtextFrame f=new JtextFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
