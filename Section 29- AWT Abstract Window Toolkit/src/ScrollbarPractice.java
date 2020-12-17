import java.awt.*;
import java.awt.event.*;

class ScrollbarFrame extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    public ScrollbarFrame()
    {
        super("Scrollbar Demo");
        setLayout(null);

        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField(20);

        tf.setBounds(50,100,300,40);
        red.setBounds(50,150,300,20);
        green.setBounds(50,200,300,20);
        blue.setBounds(50,250,300,20);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        add(tf);
        add(red);
        add(green);
        add(blue);

    }


    @Override
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
}

public class ScrollbarPractice {
    public static void main(String[] args) {
        ScrollbarFrame f=new ScrollbarFrame();
        f.setSize(400,500);
        f.setVisible(true);
    }
}
