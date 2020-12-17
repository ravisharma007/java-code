import java.lang.*;

class StudentMethod
{
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int totalMarks()
    {
        return m1+m2+m3;
    }
    public int average()
    {
        return totalMarks()/3;
    }
    public char grade()
    {
        if(totalMarks() > 60)
        {
            return 'A';
        }
        else
            return 'B';
    }
}
public class Student {
    public static void main(String[] args)
    {
        System.out.println("Student class practice : ");
        StudentMethod s1=new StudentMethod();
        s1.name="ravi";
        s1.rollNo=007;
        s1.course="MCA";
        s1.m1=80;
        s1.m2=85;
        s1.m3=97;
        System.out.println("Total marks : " + s1.totalMarks());
        System.out.println("Average marks : " + s1.average());
        System.out.println("Grade : " + s1.grade());

    }
}
