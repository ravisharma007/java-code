import java.io.*;

public class StudentChallenge2 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/source1.txt");
        FileInputStream fis2=new FileInputStream("C:/Users/dshar/Desktop/Myjava/source2.txt");

        //Appending from 1 file to another file in another file
        FileOutputStream fo=new FileOutputStream("C:/Users/dshar/Desktop/Myjava/Destination.txt");

        SequenceInputStream sis=new SequenceInputStream(fis,fis2);

        int c;
        while((c=sis.read()) != -1)
        {
            fo.write(c);
            System.out.print((char)c);
        }

        sis.close();
        fo.close();
        fis2.close();
        fis.close();

    }
}
