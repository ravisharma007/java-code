import java.lang.*;

class Myrunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println("Hello");
        }
    }

}
public class ThreadTest3 {
    public static void main(String[] args)
    {
        //Myrunnable m=new Myrunnable();
        Thread t=new Thread(new Myrunnable(),"My Thread from runnable"); //another way of calling Thread Constructor
        t.start();

        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }
    }
}
