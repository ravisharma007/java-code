import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

class JTreeFrame extends JFrame implements TreeSelectionListener
{
    JTree t;
    JLabel l;

    public JTreeFrame()
    {
        super("JTree Demo");


        l=new JLabel("NO file Selected");

        DefaultMutableTreeNode root= new DefaultMutableTreeNode("C:/Users/dshar/Desktop/Myjava");
        File f=new File("C:/Users/dshar/Desktop/Myjava");

        File fl[] =f.listFiles();

        for(int i = 0; i<fl.length; i++)
        {
            File x=fl[i];

            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                File fy[]=x.listFiles();
                for(int j=0;j<fy.length;j++)
                {
                    File y=fy[j];
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }



        t=new JTree(root);
        JScrollPane sp=new JScrollPane(t);
        t.addTreeSelectionListener(this);
        add(sp,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        l.setText(e.getPath().toString());
    }
}

public class JTreePractice {
    public static void main(String[] args) {
        JTreeFrame f=new JTreeFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
