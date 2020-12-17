import java.awt.*;

class GridFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public GridFrame()
    {
        super("Grid Demo + GridBag");
//        setLayout(new GridLayout(3,3));

        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(gb);

        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");

        gbc.gridx=1;
        gbc.gridy=1;
        add(b1,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=2;
        add(b3,gbc);

        gbc.gridx=3;
        gbc.gridy=1;
        add(b4,gbc);

        gbc.gridx=3;
        gbc.gridy=3;
        add(b5,gbc);

        gbc.gridx=4;
        gbc.gridy=2;
        add(b6,gbc);
    }
}
public class GridAndGridBackPractice {
    public static void main(String[] args) {
        GridFrame f=new GridFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
