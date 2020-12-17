import java.lang.*;

class SharedData
{
    int value=0;
    boolean flag=true;

    synchronized public void setValue(int i)
    {
        while(flag!=true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        value=i;
        try{Thread.sleep(1000);}catch(Exception e){}
        flag=false;
        notify();
    }

    int x;
    synchronized public int getValue()
    {
        while(flag!=false)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {}
        }
        x=value;
        try{Thread.sleep(1000);}catch(Exception e){}
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread
{
    SharedData ref;
    Producer(SharedData r)
    {
        ref=r;
    }

    public void run()
    {
        int i=1;
        while(true)
        {
            ref.setValue(i);
            System.out.println("Produced : "+ i++);
        }
    }
}

class Consumer extends Thread
{
    SharedData ref;
    public Consumer(SharedData r)
    {
        ref=r;
    }

    public void run()
    {
        while(true)
        {
            System.out.println("Consumed : "+ ref.getValue());
        }
    }
}
public class InterThreadTest {
    public static void main(String[] args)
    {
        SharedData data=new SharedData();

        Producer p1=new Producer(data);
        Consumer c1=new Consumer(data);

        p1.start();
        c1.start();
    }
}
