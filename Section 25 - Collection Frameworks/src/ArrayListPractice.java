import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args)
    {
        ArrayList<Integer> al1=new ArrayList<>(20);

        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80));

        al1.add(5);
        al1.add(0,10);
        al1.addAll(1,al2);

        //Traditional way for iteration
        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }

        //Iteration with the help of forEach loop and Lambda Expression
        al1.forEach(n-> System.out.println(n));

        //Iteration with the help of forEach loop and Method Reference
        al1.forEach(System.out::println);

        //Iteration with the help of show method
        al1.forEach(n->show(n));

        //ListIterator use
        System.out.println("List Iterator example");
        for(ListIterator<Integer> li=al1.listIterator() ; li.hasNext(); )
        {
            System.out.println(li.next());
        }

        }

        static void show(int n)
        {
            if(n>60)
                System.out.println(n);
        }
    }

