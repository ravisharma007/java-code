
public class StringPractice {
    public static void main(String[] args)
    {
        System.out.println("Types of Creating String in JAVA");

        String str1="java"; //1st way
        String str2=new String("JAVA");//2nd way

        char C[] ={'H','E','L','L','O'}; //
        String str3=new String(C);  // 3rd way

        byte b[]={65,66,67,68,69};// 4th way
        String str4=new String(b);

        System.out.println(str4);
    }
}
