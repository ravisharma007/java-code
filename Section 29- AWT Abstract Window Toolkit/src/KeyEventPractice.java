import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class KeyeventFrame extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;

    public KeyeventFrame()
    {
        super("KeyEvent Demo");
        setLayout(null);

        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");

        l1.setBounds(20,50,100,20);
        l2.setBounds(20,80,100,20);
        l3.setBounds(20,110,100,20);
        l4.setBounds(20,130,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

       addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        l3.setText("Key Typed");
        l4.setText(new Date(ke.getWhen())+"");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l1.setText("Key Pressed");
        l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        l2.setText("key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
}
public class KeyEventPractice {
    public static void main(String[] args) {
        KeyeventFrame f=new KeyeventFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
