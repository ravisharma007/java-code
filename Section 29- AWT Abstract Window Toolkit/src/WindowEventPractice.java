import java.awt.*;
import java.awt.event.*;

class WindowFrame extends Frame implements WindowListener
{
    Label l;

    public WindowFrame()
    {
        super("Windows Event Demo");
        setLayout(new FlowLayout());

        l=new Label("                  ");

        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}
public class WindowEventPractice {
    public static void main(String[] args) {
        WindowFrame f=new WindowFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
