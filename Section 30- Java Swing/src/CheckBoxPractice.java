import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChechkboxFrame extends JFrame implements ActionListener
{
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JTextField tf;

    public ChechkboxFrame()
    {
        super("CheckBox and Radio Button Demo");

        c1=new JCheckBox("Bold");
        c2=new JCheckBox("Italic");
        c1.setMnemonic(KeyEvent.VK_B);
        c2.setMnemonic(KeyEvent.VK_I);


        r1=new JRadioButton("lower");
        r2=new JRadioButton("UPPER");
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        tf=new JTextField("Demo text",20);
        tf.setBounds(10,20,100,80);

        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand())
        {
            case "lower" : tf.setText(tf.getText().toLowerCase());
                            break;
            case "UPPER" : tf.setText(tf.getText().toUpperCase());
        }

        int b=0,i=0;

        if(c1.isSelected())
            b=Font.BOLD;
        if (c2.isSelected())
            i=Font.ITALIC;

        Font f=new Font("Times New Roman",b|i,15);
        tf.setFont(f);
    }
}

public class CheckBoxPractice {
    public static void main(String[] args) {
        ChechkboxFrame f=new ChechkboxFrame();
        f.setSize(350,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
