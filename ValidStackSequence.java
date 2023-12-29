import java.util.*;

/**
 * ValidStackSequence
 */
/*public class ValidStackSequence {

    public static void main(String[] args) {
        
        int pushed[]={1,2,3,4,5};
        int popped[]={4,5,3,2,1};
        System.out.println(validateStackSequences(pushed, popped));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> stack= new Stack<>();
        int i=0,j=0;
        stack.push(pushed[0]);
        while(i<pushed.length ){
          int temp=stack.peek();
            if(temp==popped[j]){
                j++;
                stack.pop();
            }else if(j==pushed.length){
                break;
            } else stack.push(pushed[i++]);
}
        return stack.isEmpty();
    
        }
  
}
*/
// import java.util.Stack;

public class ValidStackSequence {

    public static void main(String[] args) {
        int pushed[] = {1, 2, 3, 4, 5};
        int popped[] = {4, 5, 3, 1, 2};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        stack.push(pushed[0]);
        
        while (i < pushed.length) {
            int temp = stack.peek();
            if (temp == popped[j]) {
                j++;
                stack.pop();
            } else if (j == pushed.length) {
                break;
            } else {
                stack.push(pushed[i++]);
            }
        }
        
        return i==popped.length;
    }
}
