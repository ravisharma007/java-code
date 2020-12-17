import java.lang.*;

class Whiteboard
{
    String text;
    int count=0;
    int numberofstudents=0;

    public void attendance()
    {
        numberofstudents++;
    }

   synchronized public void setText(String st)
    {
        System.out.println("Teacher is Writing : "+ st);
        while(count!=0)
            try{wait();}catch(Exception e){}

        text=st;
            count=numberofstudents;
            notifyAll();
    }

    synchronized public String getText()
    {
        String t;
        while(count==0)
            try{wait();}catch(Exception e){}

        t=text;
            count--;
            if(count==0)
                notify();
            return t;
    }
}

class Teacher extends Thread
{
    Whiteboard ref;
    String U[]={"java is a language","It is OOPS","It supports MultiThreading","end"};
    Teacher(Whiteboard r)
    {
        ref=r;
    }
    public void run()
    {
        for(int i=0;i<U.length;i++)
        {
            ref.setText(U[i]);
        }

    }
}
class Student extends Thread
{
    Whiteboard ref;
    String name;

    Student(Whiteboard r,String name)
    {
        this.name=name;
        ref=r;
    }

    public void run()
    {
        String text;
        ref.attendance();

        do {
            text=ref.getText();
            System.out.println(name + " Reading "+ text);
            System.out.flush();
        }while(!text.equals("end"));
    }

}
public class WhiteboardPractice {
    public static void main(String [] args)
    {
        Whiteboard obj=new Whiteboard();

        Teacher t=new Teacher(obj);

        Student s1=new Student(obj,"1) ravi:");
        Student s2=new Student(obj,"2) bhanu:");
        Student s3=new Student(obj,"3) tannu:");
        Student s4=new Student(obj,"4) soni:");

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
