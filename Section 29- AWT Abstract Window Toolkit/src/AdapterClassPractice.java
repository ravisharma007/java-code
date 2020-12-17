import java.awt.*;
import java.awt.event.*;

class AdapterFrame extends Frame
{
   public AdapterFrame()
   {
       super("Adapter Class Demo");
       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
   }

//   class InnerClass extends WindowAdapter
//   {
//       @Override
//       public void windowClosing(WindowEvent e) {
//           System.exit(0);
//       }
//   }
}
public class AdapterClassPractice {
    public static void main(String[] args) {
        AdapterFrame f=new AdapterFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
