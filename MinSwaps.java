import java.util.*;
/**
 * MinSwaps
 */
public class MinSwaps {

    public static void main(String[] args) {
        int arr[]={9 ,10 ,8 ,15 ,12 ,1 ,2 ,3 ,4 ,5};
        
        int i=0,swaps=0,count=1,loops=0;
        HashMap <Integer,Integer> map= new HashMap<>();
       int arr2[]= arr.clone();
        Arrays.sort(arr2);     
        for (int j = 0; j < arr2.length; j++) {
            map.put(arr2[j],j);
        }
        while (i<arr.length) {
             for (int j : arr) {
          System.out.print(j+" , ");
        }
        System.out.println();
            int pos1=map.get(arr[i]);
            // System.out.println(pos2);
          if(pos1==i){
            //  count++;
             i++;}
          else {
            int temp= arr[i];
            arr[i]=arr[pos1];
            arr[pos1]=temp;
            swaps=swaps+1;
          }  
        //   System.out.println("\n"+arr[i]+" swaped with "+ arr[pos1]);
    //    loops++;
        }
        System.out.println(swaps);
    }
}