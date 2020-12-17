import java.lang.*;

public class AccountChallenge {
    public static void main(String[] args)
    {
        System.out.println("Inheritance Practice via Account Problem :");
        LoanAccount person1=new LoanAccount();

        System.out.println(person1);

    }
}

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phNo;
    private String dob;
    private double balance;

    public Account() {
        balance=0.0;
        name="Null";
        address="Null";
        phNo="Null";
        dob="Null";
        accNo="Null";
    }

    public Account(String accNo, String name, String phNo, String dob)
    {
        this.accNo=accNo;
        this.name=name;
        this.phNo=phNo;
        this.dob=dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getDob() {
        return dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }


}

class SavingAccount extends Account
{

    private double fd;

    public SavingAccount()
    {
        fd=0.0;
    }

    public double getFd() {
        return fd;
    }

    public void setFd(double fd) {
        this.fd = fd;
    }

    public void deposite(double amt)
    {
        double t;
        t=getBalance();
        setBalance(t+amt);
    }
    public void withdraw(double amt)
    {
        double t;
        t=getBalance();
        if(t <= amt)
        {
            System.out.println("Not sufficient balance !");
        }
        else
        {
            setBalance(t-amt);
        }
    }

    public void liquidate()
    {
        double t,p;
        t=getFd();
        p=getBalance();
        setBalance(p+t);
        setFd(0.0);
    }
}

class LoanAccount extends SavingAccount
{
    private double loan;

    public LoanAccount()
    {
        loan=0.0;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public void payEmi(double amt)
    {
        double t;
        t=getLoan();
        if(t <= amt)
        {
            System.out.println("No loan remaining");
        }
        else
        {
            setLoan(t-amt);
        }
    }

    public void repayment()
    {
        double t=getLoan();
        if(t <= 0)
        {
            System.out.println("No loan");
        }
        else
            setLoan(loan-t);
    }

    public String toString()
    {
        return  "Account no:"+ getAccNo() +"\n" +
                "Balance:" + getBalance() + "\n" +
                "Name:" + getName() + "\n" +
                "Address:" + getAddress() + "\n" +
                "phone:" + getPhNo() + "\n" +
                "dob:" + getDob() + "\n" +
                "Fixed Deposite:" + getFd() + "\n" +
                "Loan:" + getLoan() + "\n" ;
    }
}
