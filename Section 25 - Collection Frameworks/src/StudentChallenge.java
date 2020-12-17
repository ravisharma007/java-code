import com.sun.jdi.Accessible;

import java.io.*;
import java.lang.*;
import java.util.*;

class Account implements Serializable {
    StudentChallenge ref;
    static int count =1;
    String accNo;
    String name;
    int balance;

    HashMap<String, Account> hm = new HashMap<>();

    public Account(String accno,String name, int balence) {
        this.accNo=accno;
        this.name = name;
        this.balance = balence;
//        this.accNo = "BANK" + Integer.parseInt("00") + +count;
//        count++;
    }

//


    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
public class StudentChallenge {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
//        Account a1=new Account("ravi",1000);
//        Account a2=new Account("ram",2000);
        Account acc=null;
        HashMap<String,Account> hm=new HashMap<>();

//        System.out.println(a1);
//        System.out.println(a2);



//        hm.put(a1.accNo,a1);
//        hm.put(a2.accNo,a2);
//        hm.forEach((k,v)-> System.out.println(v));

//        hm.remove(a1.accNo);
//        System.out.println("Removed");
//        hm.forEach((k,v)-> System.out.println(v));

        //File Input Stream
        try
        {
            FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/AccountDetails.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int count=ois.readInt();

            for(int i=0;i<count;i++)
            {
                acc=(Account)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo,acc);
            }
        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }

        // File Output Stream

            FileOutputStream fos = new FileOutputStream("C:/Users/dshar/Desktop/Myjava/AccountDetails.txt");
            ObjectOutputStream os=new ObjectOutputStream(fos);

//            os.writeInt(hm.size());
//
//            for(Account a: hm.values())
//            {
//                os.writeObject(a);
//            }
//            os.close();
//            fos.close();



        System.out.println("Menu");
        int choice;
        String accno;
        String name;
        int balance;

        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");

            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Details : Account No");

                    sc.nextLine();
                    accno=sc.nextLine();
                    System.out.println("Name");
                    name=sc.nextLine();
                    System.out.println("Enter the Details : Balance");
                    balance=sc.nextInt();
                    acc=new Account(accno,name,balance);
                    hm.put(acc.accNo,acc);
                    System.out.println("Account Created" +name);

                    break;

                case 2:
                    System.out.println("Enter the Account number");
                    String key= sc.nextLine();
                    sc.nextLine();
                    hm.remove(key);
                    System.out.println("Account Removed");
                    break;

                case 3:
                    System.out.println("Enter Account number");
                    accno = sc.nextLine();
                    sc.nextLine();
                    acc=hm.get(accno);
                    System.out.println(acc);
                    break;

                case 4:
                    System.out.println("All Accounts :-");

                    for(Account a:hm.values())
                        System.out.println(a);

                    break;

                case 5:
                case 6:
                    os.writeInt(hm.size());
                    for(Account a: hm.values())
                    {
                        os.writeObject(a);
                    }
            }
        }while(choice !=6 );

        os.flush();
        os.close();
        fos.close();



    }
}
