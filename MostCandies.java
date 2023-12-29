import java.util.*;
/**
 * MostCandies
 */
public class MostCandies {

    public static void main(String[] args) {
        int candies[]={2,3,5,1,3};
        int arr[]=candies.clone();
         
        int extraCandies=3;int j=0;
        boolean result[] = new boolean[candies.length];
      for (int i = 0; i < result.length; i++) {
         int num=candies[i]+extraCandies;
        candies[i]=candies[i]+extraCandies;
       
        result[i]=isMax(candies, num);
        candies[i]=candies[i]-extraCandies;
      }
        
        for (boolean b : result) {
            System.out.print(b+" ,");
        }
        System.out.println();
    }
    public static boolean isMax(int[] arr, int num){
        boolean greatest=true;
        for (int k : arr) {
           greatest=true;
            if (k>num) { System.out.println("element is "+k+" num is "+num);
                greatest=false;
                break;
            }
        }
        return greatest;

    }
    
}
