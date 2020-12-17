import java.awt.*;
import java.awt.event.*;

class MenuFrame extends Frame
{
    MenuBar menuBar;
    Menu file,subMenu;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem autoSave;

    TextField tf;

    public MenuFrame()
    {
        super("Menu Demo");

        open=new MenuItem("Open");
        save=new MenuItem("Save");
        close=new MenuItem("Close");
        closeAll=new MenuItem("Close All");
        autoSave=new CheckboxMenuItem("Auto Save",false);

        file=new Menu("File");
        subMenu=new Menu("Close");
        subMenu.add(close);
        subMenu.add(closeAll);

        file.add(open);
        file.add(save);
        file.add(subMenu);
        file.add(autoSave);

        menuBar=new MenuBar();
        menuBar.add(file);
        setMenuBar(menuBar);

        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        //all the Listeners and Registration via Lambda Expressions :-

        //closing Windows :
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Action event Listeners :
        open.addActionListener((ActionEvent ae) -> {tf.setText("Open");});
        save.addActionListener((ActionEvent ae) -> {tf.setText("Save");});
        close.addActionListener((ActionEvent ae) -> {tf.setText("Close");});
        closeAll.addActionListener((ActionEvent ae) -> {tf.setText("Close All");});

        autoSave.addItemListener((ItemEvent ie) -> {
            if(autoSave.getState())
                tf.setText("Auto On");
            else
                tf.setText("Auto Off");
        });

    }
}
public class MenuPractice {
    public static void main(String[] args) {
        MenuFrame f=new MenuFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
