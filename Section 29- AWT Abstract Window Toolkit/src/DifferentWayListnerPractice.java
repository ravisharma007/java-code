import java.awt.*;
import java.awt.event.*;

class DifferentwayFrame extends Frame
{
    TextField tf;
    Button b;
    int count=0;

    public DifferentwayFrame()
    {
        super("Diffrent ways of using Listeners :");
        setLayout(new FlowLayout());

        tf=new TextField("0",20);
        b=new Button("Click");

        add(tf);
        add(b);

        b.addActionListener((ActionEvent ae) -> {count++; tf.setText(String.valueOf(count));});


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

public class DifferentWayListnerPractice {
    public static void main(String[] args) {
        DifferentwayFrame f=new DifferentwayFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
