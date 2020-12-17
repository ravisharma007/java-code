import java.awt.*;
import java.awt.event.*;
import java.util.*;

class AnimationFrame extends Frame implements Runnable
{
    int x=0,y=0,tx,ty;

    public AnimationFrame()
    {
        super("Animation Demo");
        x=10;
        y=35;

        tx=ty=1;
        Thread t=new Thread(this);
        t.start();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.fillOval(x,y,50,50);
    }

    public void run()
    {
        while(true)
        {
            x=x+tx;
            y=y+ty;

            if(x<0 || x>450)
                tx=tx*-1;
            if(y<30 || y>350)
                ty=ty*-1;

            repaint();

            try
            {
                Thread.sleep(5);
            }
            catch (Exception e)
            {

            }
        }
    }
}

public class AnimationPractice {
    public static void main(String[] args) {
        AnimationFrame f=new AnimationFrame();
        f.setSize(500,400);
        f.setVisible(true);
    }
}
