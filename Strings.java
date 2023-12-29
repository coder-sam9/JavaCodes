import java.util.*;
class Operation_String{
    public static void main(String[] args) {
        String S="My Name is Sami Uddin";
        String Y=" I'm learning Full Stack";
        for(int i=0;i<S.length();i++){
            // System.out.println(S.charAt(i));

        }
        // System.out.println(S.substring(2,15));
        System.out.println(S+" "+"and"+Y);
        String words[]=S.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);

        }
    }
}