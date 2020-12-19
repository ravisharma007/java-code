import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SplitPaneFrame extends JFrame implements ListSelectionListener
{
    JScrollPane scrollPane;
    JSplitPane splitPane;
    JLabel label;
    JList list;

    public SplitPaneFrame()
    {
        super("SplitPane and TabbedPane Demo");

        String colors[]={"RED","GREEN","BLUE","PINK","BROWN","MAGENTA","YELLOW","WHITE","BLACK"};
        list=new JList(colors);
        list.setSelectedIndex(0);
        scrollPane=new JScrollPane(list);

        label=new JLabel(" ");
        label.setOpaque(true);
        label.setBackground(Color.RED);
        JScrollPane scrollPane2=new JScrollPane(label);

        splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPane,scrollPane2);
        splitPane.setDividerLocation(200);
        add(splitPane);

        list.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
       String str=(String)list.getSelectedValue();

       switch (str)
       {
           case "RED" : label.setBackground(Color.RED);
                        break;
           case "GREEN" : label.setBackground(Color.GREEN);
               break;
           case "BLUE" : label.setBackground(Color.BLUE);
               break;
           case "PINK" : label.setBackground(Color.PINK);
               break;
           case "WHITE" : label.setBackground(Color.WHITE);
               break;
           case "MAGENTA" : label.setBackground(Color.MAGENTA);
               break;
           case "YELLOW" : label.setBackground(Color.YELLOW);
               break;
           case "BLACK" : label.setBackground(Color.BLACK);
               break;
           case "BROWN" : label.setBackground(Color.darkGray);
               break;
       }
    }
}

public class SplitPanePractice {
    public static void main(String[] args) {
        SplitPaneFrame f=new SplitPaneFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
