import java.awt.*;
import java.awt.event.*;

class CardFrame extends Frame implements ItemListener {
    Checkbox c1, c2;
    CheckboxGroup cbg;
    Button b1, b2, b3;
    TextField t1, t2, t3;

    Panel p1, p2, mp, cp;
    CardLayout cl;

    public CardFrame()
    {
        super("Card Demo");

        cbg = new CheckboxGroup();
        cp = new Panel();
        c1 = new Checkbox("One", true, cbg);
        c2 = new Checkbox("Two", false, cbg);
        cp.add(c1);
        cp.add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);

        p1 = new Panel();
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mp = new Panel();
        cl = new CardLayout();
        mp.setLayout(cl);
        mp.add("One", p1);
        mp.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mp, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if (c1.getState())
            cl.first(mp);
        else
            cl.last(mp);
    }
}

public class CardLayoutPractice {
    public static void main(String[] args) {
        CardFrame f = new CardFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
