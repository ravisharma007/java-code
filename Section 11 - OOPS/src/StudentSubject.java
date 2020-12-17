import java.lang.*;
import java.util.Arrays;

class Subject
{
    private String subId;
    private String name;
    private int marksObtained;
    private int maxMarks;

    public Subject(String subId,String name,int maxMarks)
    {
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubId()
    {
        return subId;
    }
    public String getName()
    {
        return name;
    }
    public int getMarksObtained()
    {
        return marksObtained;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }

    public void setMarksObtained(int marksObtained)
    {
        this.marksObtained=marksObtained;
    }
    public void setMaxMarks(int maxMarks)
    {
        this.maxMarks=maxMarks;
    }

    /*public String toString()
    {
        return "\nSubject ID: "+subId+"\nSubject Name: "+name+"\nMarks obtained: "+marksObtained+"\nMax marks: "+maxMarks;
    }*/

    @Override
    public String toString() {
        return "Subject{" +
                "subId='" + subId + '\'' +
                ", name='" + name + '\'' +
                ", marksObtained=" + marksObtained +
                ", maxMarks=" + maxMarks +
                '}';
    }
}

class Students
{
    private String rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    public String getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
public class StudentSubject {
    public static void main(String[] args)
    {
        System.out.println("Student and subject example :" );
        Subject subs[]=new Subject[3]; //Array of refrences
        subs[0]=new Subject("101","java",100);
        subs[1]=new Subject("102","C++",100);
        subs[2]=new Subject("103","maths",100);

        for(Subject s:subs)
            System.out.println(s);

        Students students = new Students();
        students.setRollNo("1");
        students.setDept("dep");
        students.setName("asd");
        students.setSubjects(subs);

        System.out.println(students);


    }
}
