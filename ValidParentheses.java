import java.util.*;
/**
 * ValidParentheses
 */
public class ValidParentheses {

    
    public static void main(String[] args) {
        String str1="()";
        String str2="(){}[]";
        String str3="(}";
        // System.out.println(isValid(str1));
        System.out.println(isValid(str2));
         System.out.println(isValid(str3));
    }
    public static boolean isValid(String s) {
        // char openFlower='{';
        // // char closeFlower='}';
        // char openRound='(';
        // // char closeRound=')';
        // char openSquare='[';
        // // char closeSquare=']';
        String roundB="()";
        String squareB="[]";
        String flowerB="{}";
        Stack <Character> stack = new Stack<>();
        boolean ans=true;
        int len=s.length();
        if(len%2!=0) return false; 
        for(int i=0;i<len;i++){
            char ele1=s.charAt(i);
             if(ele1=='{' || ele1=='(' || ele1=='['){
                stack.push(ele1);
            }
            else if(stack.isEmpty()) return false;
            else {
                
                switch(ele1){
                    case '}': {
                        char topp=stack.peek();
                       String str1=String.valueOf(topp)+"}";
                        if(str1.equals(flowerB)) {stack.pop();
                        }
                        else return false;
                  break;  }
                    case ')': {
char topp=stack.peek();
                       String str1=String.valueOf(topp)+String.valueOf(ele1);
                        if(str1.equals(roundB)) {
                            stack.pop();
                        }
                        else return false;
                        break;
                    }
                    case ']': {
                         char topp=stack.peek();
                       String str1=String.valueOf(topp)+"]";
                        if(str1.equals(squareB)) {stack.pop();
                        }
                        else return false;
break;
                    }
                     default : return false;
                }
            }
        }
        return ans;
    }
}