public class StudentExcercise3 {
    public static void main(String[] args)
    {
        String str="a!b@c1*2%3";

        String str2 = str.replaceAll("\\W*","");
        System.out.println(str2);
        //======================================
        String spacestr="   ab    cd    ef   ";
        String onespace=spacestr.replaceAll("\\s+"," ").trim();
        System.out.println(onespace);

        //===========================

        String word[]= onespace.split("\\s");
        System.out.println(word.length);
    }
}
