import java.awt.*;
import java.awt.event.*;

class CheckboxFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;

    public CheckboxFrame()
    {
        super("Check box Demo");
        setLayout(new FlowLayout());

        l=new Label("Nothing is Selected");
        c1=new Checkbox("Java");
        c2=new Checkbox("Python");
        c3=new Checkbox("C#");

        c1.addItemListener(this);
        c3.addItemListener(this);
        c2.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String str="";

        if(c1.getState())
            str=str+" "+c1.getLabel();

        if(c2.getState())
            str=str+" "+c2.getLabel();

        if(c3.getState())
            str=str+" "+c3.getLabel();

        if(str.isEmpty())
            str="Nothing is Selected";

        l.setText(str);
    }
}

public class CheckBoxDemo {
    public static void main(String[] args) {

        CheckboxFrame f=new CheckboxFrame();
        f.setSize(600,400);
        f.setVisible(true);
    }
}