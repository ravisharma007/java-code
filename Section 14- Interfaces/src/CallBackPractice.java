import java.lang.*;

//Interface Member
interface Member
{
    void callback();
}

//class customer
class Customer implements Member
{
    public String name;

    public Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, i will visit "+name);
    }
}

//class store who will invite members
class Store
{
    //Array of Members-
    Member members[]=new Member[10];
    int count=0;

    public void register(Member m)
    {
        members[count++]=m;
    }

    public void invite()
    {
        for(int i=0;i<count;i++)
        {
            members[i].callback();
        }
    }
}
public class CallBackPractice {
    public static void main(String [] args)
    {
        Customer c1=new Customer("jhon");
        Customer c2=new Customer("smith");

        Store st1=new Store();
        st1.register(c1);
        st1.register(c2);

        st1.invite();
    }
}
