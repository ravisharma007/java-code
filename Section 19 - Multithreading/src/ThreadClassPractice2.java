import java.lang.*;

class TestThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ + "My thread");
        }
    }
}
public class ThreadClassPractice2 {
    public static void main(String[] args)
    {
        TestThread t=new TestThread();
        t.setDaemon(true);
        t.start();

//        try {
//            Thread.sleep(100);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }

//        Thread mainThread=Thread.currentThread(); //giving refrence to main thread
//        try {
//            mainThread.join();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }


        int count=1;
        while(true)
        {
            System.out.println(count++ + "main");
            Thread.yield(); // yielding main thread for above thread
            
        }
    }
}
