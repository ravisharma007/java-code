import java.lang.*;

//class Outer1
//{
//    public int x=10;
//    public static int y=20;
//
//    public void display()
//    {
//        class InnerMethod
//        {
//            public void show()
//            {
//                System.out.println("Hello");
//            }
//        }
////        InnerMethod obj =new InnerMethod();
////        obj.show();
//
//       // new InnerMethod().show(); //This is Anonymous Object
//
//    }
//}


interface My
{
    void display();
}

//class Outer2
//{
//    int x=10;
//    Testing t=new Testing();
//
//    class Testing implements My
//    {
//        @Override
//        public void display() {
//            System.out.println("Testing inner Interface-");
//        }
//    }
//}

//class Outer3
//{
//    int x=10;
//    static int y=20;
//
//    static class StaticInner
//    {
//        public void display()
//        {
//            System.out.println(y);
//        }
//    }
//
//}

class Outer4
{
    public void show()
    {
//        new My()  //Anonymous class with anonymous object
//        {
//            public void display()
//            {
//                System.out.println("this is anonymous class calling with anonymous object");
//            }
//        }.display();

        My m=new My()
        {
            public void display()
            {
                System.out.println("this is anonymous class calling");
            }
        };
        m.display();
    }

}
public class PracticeInnerCLass {
    public static void main(String[] args)
    {
//        Outer1 ot=new Outer1();
//        ot.display();

//        Outer2 ot2=new Outer2();
//        ot2.t.display();

//        Outer3.StaticInner ot3=new Outer3.StaticInner();
//        ot3.display();

        Outer4 ot4 = new Outer4();
        ot4.show();
    }
}
