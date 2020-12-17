class MyGen<T>
{
    T obj;

    public void setData(T value)
    {
        obj=value;
    }
    public T getData()
    {
        return obj;
    }
}

public class GenericPractice {
    public static void main(String[] args)
    {
        MyGen<String> mg=new MyGen<>();
        mg.setData("10");
        System.out.println(mg.getData());
    }
}
