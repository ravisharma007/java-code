import java.awt.*;
import java.awt.event.*;

class FlowAndBoarderFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public FlowAndBoarderFrame()
    {
        super("Flow and Boarder Demo with Panel");

        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");

//        FlowLayout fl=new FlowLayout();
//        fl.setAlignment(FlowLayout.RIGHT);
//        fl.setHgap(100);
//        setLayout(fl);

        BorderLayout bl=new BorderLayout();
        setLayout(bl);

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
//        add(b6);

        //Panel :
        Panel p=new Panel();
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
        p.setLayout(new GridLayout(3,1));

        add(p,BorderLayout.EAST);
    }
}
public class FlowAdBoarderLayoutPractice {
    public static void main(String[] args) {
        FlowAndBoarderFrame f=new FlowAndBoarderFrame();
        f.setSize(300,300);
        f.setVisible(true);

    }
}
