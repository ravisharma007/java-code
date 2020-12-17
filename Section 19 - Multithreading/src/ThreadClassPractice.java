import java.lang.*;

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);

    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadClassPractice {

    public static void main(String[] args)
    {
        MyThread t=new MyThread("My Thread 1");
        t.start();
        t.interrupt();

//        System.out.println("ID "+t.getId());
//        System.out.println("name "+t.getName());
//        System.out.println("Priority "+t.getPriority());
//        t.start();
//        System.out.println("State "+t.getState());
//        System.out.println("Active "+ t.isAlive());
    }

}
