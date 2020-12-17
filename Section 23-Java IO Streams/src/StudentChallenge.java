import java.io.*;
import java.util.Locale;

class InputOnScreen
{
    public String methRead() throws Exception
    {
        try(FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/source1.txt"))
        {
            byte b[]=new byte[fis.available()];

            fis.read(b);
            String str=new String(b);
            System.out.println(str);
            return str;
        }
    }
}

class OutputOnFile
{
    public void methWrite() throws Exception
    {
        InputOnScreen obj=new InputOnScreen();
        String str=obj.methRead();
        System.out.println(str);

//        String str2=str.toLowerCase();
//        System.out.println(str2);




        try(FileOutputStream fo=new FileOutputStream("C:/Users/dshar/Desktop/Myjava/source2.txt"))
        {
//            String str="LEARN JAVA";
//            byte b[]=str.getBytes();
//            fo.write(b);              //Creating Source 1 File "LEARN JAVA"
            String str2=str.toLowerCase();
            byte b[]=str2.getBytes();

            fo.write(b);
        }
    }
}
public class StudentChallenge {
    public static void main(String[] args) throws Exception
    {
        InputOnScreen ios=new InputOnScreen();
        OutputOnFile of=new OutputOnFile();

        of.methWrite();
//        ios.methRead();
    }
}
