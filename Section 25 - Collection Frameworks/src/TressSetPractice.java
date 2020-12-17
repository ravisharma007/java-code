import java.util.*;

public class TressSetPractice {
    public static void main(String[] args)
    {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,10,40));
        ts.add(15);
        
        System.out.println(ts);
    }
}
