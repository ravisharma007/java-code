import java.awt.*;
import java.awt.event.*;

class TextareaFrame extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    public TextareaFrame()
    {
        super("Text Area Demo");

        ta=new TextArea(10,0);
        tf=new TextField(10);
        l=new Label("Nothing is here");
        b=new Button("click");

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        ta.append(tf.getText());
//        ta.insert(tf.getText(),ta.getCaretPosition());
        l.setText(ta.getSelectedText());

    }
}

public class TextAreaDemo {
    public static void main(String[] args) {
        TextareaFrame f=new TextareaFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
