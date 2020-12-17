import java.awt.*;

class Myapp extends Frame
{
    Label l;
    TextField t;
    Button b;

    public Myapp()
    {
        super("First app 2nd Method");

        setLayout(new FlowLayout());

        l=new Label("Name");
        t=new TextField(20);
        b=new Button("OK");

        add(l);
        add(t);
        add(b);
    }
}
public class FirstAppMeth2 {
    public static void main(String[] args) {

        Myapp f=new Myapp();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
