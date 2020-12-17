import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {

        Frame f=new Frame("My First App");

        FlowLayout fl=new FlowLayout();
        f.setLayout(fl);

        Label l=new Label("Name");
        TextField tf=new TextField("type here..");
        Button b=new Button("OK");

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(500,300);
        f.setVisible(true);
    }
}
