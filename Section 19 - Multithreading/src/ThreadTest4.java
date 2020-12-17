import java.lang.*;

public class ThreadTest4 implements Runnable {

    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args)
    {
        ThreadTest4 m=new ThreadTest4();
        Thread t=new Thread(m);
        t.start();

        int i=1;
        while(true)
        {
            System.out.println("world");
        }
    }
}
