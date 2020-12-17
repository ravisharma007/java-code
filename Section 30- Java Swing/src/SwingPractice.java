import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingDemoFrame extends JFrame
{
    JLabel l;
    JButton b;
    int count=0;

    public SwingDemoFrame()
    {
        super("Swing Demo");
        setLayout(new FlowLayout());

        l=new JLabel("Clicked "+count+" Times");
        b=new JButton();

        add(l);
        add(b);



        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("D:\\ravi\\MCA\\3rd Sem\\Java\\Java Code\\Section 30- Java Swing\\lib\\clickImage.png"));

        l.setToolTipText("Counter");

        b.addActionListener((ActionEvent ae) -> {
            count++;
            l.setText("Clicked "+count+" Times");
        });
    }
}
public class SwingPractice {
    public static void main(String[] args) {
        SwingDemoFrame f=new SwingDemoFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
