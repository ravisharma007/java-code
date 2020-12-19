import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class BorderFrame extends JFrame
{
    JTextField tf;
    JLabel l;
    JButton b;

    JPanel p;

    public BorderFrame()
    {
        super("Border Demo in Swing");
        setLayout(new FlowLayout());

        l=new JLabel("Name");
        tf=new JTextField("",20);
        b=new JButton("click");

        p=new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);

        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED,3),"Login",TitledBorder.CENTER,TitledBorder.CENTER);
        p.setBorder(br);

        add(p);
    }
}

public class BorderPractice {
    public static void main(String[] args) {
        BorderFrame f=new BorderFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
