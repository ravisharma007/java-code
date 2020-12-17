import java.io.FileInputStream;

public class FileInputPractice {
    public static void main(String[] args) throws Exception
    {
        /*try(FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/Test.txt");)
        {
            byte b[]=new byte[fis.available()];

            fis.read(b);
            String str=new String(b);

            System.out.println(str);
        } */

        //Another way of reading
        try(FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/Test.txt");)
        {
            int x;

            while((x=fis.read()) != -1)
            {
                System.out.print((char)x);
            }
        }
    }
}
