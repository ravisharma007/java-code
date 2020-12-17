import java.awt.*;
import java.awt.event.*;

class ListboxFrame extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;

    public ListboxFrame()
    {
        super("List Box Demo");
        setLayout(new FlowLayout());

        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,20);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

        add(l);
        add(c);
        add(ta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strArr[]=l.getSelectedItems();

        String txt="";

        for (String x:strArr)
            txt+=x+"\n";

        ta.setText(txt);

    }

    @Override
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
            ta.setText(c.getSelectedItem());

    }
}
public class ListBoxPractice {
    public static void main(String[] args) {
        ListboxFrame f=new ListboxFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
