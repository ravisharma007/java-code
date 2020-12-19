import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SliderFrame extends JFrame implements ChangeListener
{
    JPanel p1,p2;
    JSlider slider;
    JProgressBar progressBar;

    int w=50;
    public SliderFrame()
    {
        super("JSlider and JProgressBar Demo");
        slider=new JSlider(0,100,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        p1=new JPanel(){
            public void paintComponent(Graphics g)
            {
                g.drawOval(200,200,w,w);
            }
        };

        p2=new JPanel();
        progressBar=new JProgressBar();
        progressBar.setString("50%");
        progressBar.setStringPainted(true);
        p2.add(progressBar);

        add(slider,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        slider.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w=slider.getValue();
        p1.repaint();
        progressBar.setString(w+"%");
        progressBar.setStringPainted(true);
        progressBar.setValue(w);

    }
}

public class SliderPractice {
    public static void main(String[] args) {
        SliderFrame f=new SliderFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
