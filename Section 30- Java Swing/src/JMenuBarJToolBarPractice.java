import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

class JMenubarFrame extends JFrame implements ActionListener
{
    JToolBar tb;
    JButton b1,b2,b3,b4;
    JTextArea ta;

    public JMenubarFrame()
    {
        super("JToolBar Demo");

        tb=new JToolBar();
        b1=new JButton("New",new ImageIcon());
        b2=new JButton("Save",new ImageIcon());
        b3=new JButton("Open",new ImageIcon());
        b4=new JButton("Close",new ImageIcon());

        tb.add(b1); tb.add(b2);
        tb.addSeparator();
        tb.add(b3); tb.add(b4);
        add(tb,BorderLayout.NORTH);


        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        add(sp,BorderLayout.CENTER);

        JMenuBar mb=new JMenuBar();
        JMenu mnu=new JMenu("File");
        JMenuItem m1=new JMenuItem("New");
        JMenuItem m2=new JMenuItem("Open");
        mnu.add(m1);
        mnu.addSeparator();
        mnu.add(m2);
        mb.add(mnu);
        setJMenuBar(mb);

        b3.setActionCommand("Open");
        b3.addActionListener(this);
        m2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Open")) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File file=fc.getSelectedFile();

            try
            {
                FileInputStream fis=new FileInputStream(file);
                byte b[]=new byte[fis.available()];
                fis.read(b);
                String text=new String(b);
                ta.setText(text);
                fis.close();
            }
            catch(Exception exc)
            {
                System.out.println(exc);
            }
        }
    }
}

public class JMenuBarJToolBarPractice {
    public static void main(String[] args) {
        JMenubarFrame f=new JMenubarFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
