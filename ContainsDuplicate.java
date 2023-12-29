import java.util.*;
 /**
  * ContainsDuplicate
  */
 public class ContainsDuplicate {
 
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        HashSet <Integer> set = new HashSet<>();
        // boolean contains = false;
        for (int ele : nums) {
            if(set.contains(ele)) System.out.println(ele);
           else set.add(ele);
        }
        System.out.println(false);
    }
 }