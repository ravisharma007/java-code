import java.awt.*;
import java.awt.event.*;

class RadiobuttonFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    public RadiobuttonFrame()
    {
        super("Radio Button Demo");
        setLayout(new FlowLayout());

        l=new Label("Nothing is Selected");
        cbg=new CheckboxGroup();
        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3 =new Checkbox("C#",false,cbg);

        c1.addItemListener(this);
        c1.addItemListener(this);
        c3.addItemListener(this);

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

public class RadioButtonDemo {
    public static void main(String[] args) {
        RadiobuttonFrame f=new RadiobuttonFrame();
        f.setSize(600,400);
        f.setVisible(true);
        //String str = new String("asfgf");
        //str.isEmpty();
    }
}
