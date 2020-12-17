import java.awt.*;
import java.awt.event.*;

class PaintFrame extends Frame
{
    int x=0,y=0;

    public PaintFrame()
    {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }

        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawOval(x,y,50,50);

    }
}

public class PaintPractice {
    public static void main(String[] args) {
        PaintFrame f=new PaintFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
