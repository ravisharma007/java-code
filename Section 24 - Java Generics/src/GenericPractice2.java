class GenArrayType<T>
{
    T list[]=(T[]) new Object[10];

    int length=0;
    public void append(T v)
    {
        list[length++]=v;
    }
    public void display()
    {
        for(int i=0; i<length; i++)
        {
            System.out.println(list[i]);
        }
    }
}

public class GenericPractice2 {
    public static void main(String[] args)
    {
        GenArrayType<Integer> gt=new GenArrayType();

        gt.append(10);
        gt.append(20);
        gt.append(30);

        gt.display();
    }
}
