import java.awt.*;
import java.awt.event.*;

class TextfiledFrame extends Frame
{
    Label l1,l2;
    TextField tf;

    public TextfiledFrame()
    {
        super("Text field Demo");

        l1=new Label("Nothing is there");
        l2=new Label("Enter is not pressed yet");
        tf=new TextField(20);

        Handler h=new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    class Handler implements TextListener,ActionListener
    {
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {


            String str=tf.getText();
            if(str.isEmpty())
                l2.setText("empty textfield");
            else
                l2.setText(tf.getText());
        }
    }
}

public class TextFiledDemo {
    public static void main(String[] args) {
        TextfiledFrame f=new TextfiledFrame();
        f.setSize(600,600);
        f.setVisible(true);
    }
}
