import java.lang.*;
import java.util.*;

class Student
{
    public String rollNo;
    static private int count=1;
    private String genrateRollNo()
    {
        Date d=new Date();
        String rn = "Univ-" + (d.getYear()+1900) +"-"+ count;
        count++;
        return rn;
    }

    public Student()
    {
        rollNo=genrateRollNo();
    }
}
public class StudentChalleange {
    public static void main(String[] args)
    {
        Student s1=new Student();
        System.out.println(s1.rollNo);

        Student s2=new Student();
        Student s3=new Student();

        System.out.println(s2.rollNo);
        System.out.println(s3.rollNo);
    }
}
