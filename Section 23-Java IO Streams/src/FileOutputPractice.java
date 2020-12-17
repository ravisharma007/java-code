import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputPractice {
    public static void main(String[] args) throws Exception
    {

        /*try
        {
            FileOutputStream fo=new FileOutputStream("C://Users/dshar/Desktop/Myjava/Test.txt");
            String str="Learn JAVA Programing";

            fo.write(str.getBytes());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println(e);
        } */

        /* try(FileOutputStream fo=new FileOutputStream("C://Users/dshar/Desktop/Myjava/Test.txt");)
        {
            String str="Learn JAVA Programing";
            byte b[]=str.getBytes();

            fo.write(b,6,str.length()-6);
            //fo.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println(e);
        } */

        try(FileOutputStream fo=new FileOutputStream("C:/Users/dshar/Desktop/Myjava/source1.txt");)
        {
            String str="LEARN JAVA";
            byte b[]=str.getBytes();

            fo.write(b);
            fo.close();
        }
    }
}
