import java.util.*;
/**
 * RemoveDuplicatesString
 */
public class RemoveDuplicatesString {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbabaaa"));
    }
    public static String removeDuplicates(String s) {
        int len=s.length();
        StringBuilder res = new StringBuilder();
        // String res="";
        Stack <Character> stack= new Stack<>();
        for(int i=0;i<len;i++){
             char curChar=s.charAt(i);
            if(stack.isEmpty() || stack.peek()!= curChar) {
                stack.push(curChar);
            }
            else stack.pop();

        }
        while(!stack.isEmpty()){
            char pop=stack.pop();
            System.out.println(pop);
            res.insert(0,pop);
        }
        return res.toString();
        
    }
}