public class practiceStringMethods {
    public static void main(String[] args)
    {
        System.out.println("Practicing various methods of String Class Builtin Methods:-");

      /*  String str="netbeans";

        int length=str.length(); //1st length of a string
        String str2=str.toUpperCase(); // 2nd
        String str3=str.trim(); // 3rd
        String str4=str.substring(3,7); //4th
        String str5=str.replace('e','M');

        System.out.println(str5+ "\n"+ str);   */

        //======================part 2 of tutorial==========
        String str="www.google.com";

        boolean start = str.startsWith("www"); //1st
        boolean startOverloaded =str.startsWith("google",4); //2
       boolean ends= str.endsWith(".com"); //3
        char c=str.charAt(4); //4

       /* for(int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        } */

        int index =str.indexOf('g',6);
        int lastindex =str.lastIndexOf('g');

        System.out.println(lastindex);


    }
}
