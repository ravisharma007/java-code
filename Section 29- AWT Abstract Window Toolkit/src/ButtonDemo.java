import java.awt.*;
import java.awt.event.*;

class MYFrame extends Frame implements ActionListener
{
    Label l;
    Button b;
    int count=0;

    public MYFrame()
    {
        super("Button Test");
        setLayout(new FlowLayout());

        l=new Label(String.valueOf(count));
        b=new Button("Click");
        b.addActionListener(this);

        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText(String.valueOf(count));
    }
}

public class ButtonDemo {
    public static void main(String[] args) {

        MYFrame f=new MYFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
