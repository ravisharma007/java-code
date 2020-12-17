import java.lang.*;
class ATM
{
    synchronized public void checkBalance(String name)
    {
        System.out.println("Mr/Mrs "+name+"'s Balance");
        try{Thread.sleep(100);}catch(Exception e){}
    }

    synchronized public void withdraw(String name,double amt)
    {
        System.out.println("Mr/Mrs "+name+" withdraw amount :"+amt);
        try{Thread.sleep(100);}catch(Exception e){}

    }
}

class Customer extends Thread
{
    ATM ref;
    String name;
    double amt;
    public Customer(String name,double amt,ATM r)
    {
        this.name=name;
        this.amt=amt;
        ref=r;
    }

    public void run()
    {
        ref.checkBalance(name);
        ref.withdraw(name,amt);
    }
}
public class PracticeATM {
    public static void main(String[] args)
    {
        ATM machine=new ATM();

        Customer c1=new Customer("ravi",1000,machine);
        Customer c2=new Customer("bhanu",2000,machine);

        c1.start();
        c2.start();
    }
}
