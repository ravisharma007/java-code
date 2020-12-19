import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class JSpinnerFrame extends JFrame implements ChangeListener,ActionListener,ListSelectionListener
{
    JSpinner sp1,sp2;
    JTextField tf;
    JList list;
    JComboBox cb;

    public JSpinnerFrame()
    {
        super("JSpinner,ComboBox and JList Demo");

        String contry[]={"India","USA","Russia","England","Africa","Dubai"};
        String month[]={"January","February","March","April","May","June",
                            "July","August","September","October","November","December"};

        String day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        cb=new JComboBox(contry);
        list=new JList(month);
        tf=new JTextField(15);
        JScrollPane listScrollpane=new JScrollPane(list);

        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(day));

        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
        cb.addActionListener(this);
        list.addListSelectionListener(this);

        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(listScrollpane);
        add(tf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText(String.valueOf(cb.getSelectedItem()));
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1)
            tf.setText(String.valueOf(sp1.getValue()));
        else
            tf.setText(String.valueOf(sp2.getValue()));
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText(String.valueOf(list.getSelectedValue()));
    }
}

public class JSpinnerPractice {
    public static void main(String[] args) {
        JSpinnerFrame f=new JSpinnerFrame();
        f.setSize(280,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
