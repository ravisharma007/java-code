import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class InternalFrame extends JInternalFrame
{
    static int count=0;
    JScrollPane sp;
    JTextArea ta;

    public InternalFrame()
    {
        super("Document "+ (++count),true,true,true,true);

        ta=new JTextArea();
        sp=new JScrollPane(ta);

        JMenuBar mb=new JMenuBar();
        JMenu mnu=new JMenu("File");
        JMenuItem mi=new JCheckBoxMenuItem("save");

        mnu.add(mi);
        setJMenuBar(mb);

        add(sp);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);


    }
}

class ExternalFrame extends JFrame implements ActionListener
{
    JDesktopPane jp;

    public ExternalFrame()
    {
        super("Internal Frame Demo");

        jp=new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb=new JMenuBar();
        JMenu mnu=new JMenu("File");
        JMenuItem mi=new JMenuItem("New");

        mnu.add(mi);
        mb.add(mnu);
        setJMenuBar(mb);

        mi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InternalFrame internalFrame=new InternalFrame();
        jp.add(internalFrame);

    }
}

public class InternalFramePractice {
    public static void main(String[] args) {
        ExternalFrame f=new ExternalFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
