import  java.util.*;
/**
 * BadNumbers
 */
public class BadNumbers {

    public static void main(String[] args) {
        int arr[] = new int[7];
        int count=0; int div=0;
            for(int i=10;count<7;i++){
                div=0;
               int num=i;
                while(num>0){
;                    div=div+num%10;
                    num=num/10;
                }
                if(i%div==0) {
                    arr[count++]=i;
                }
            }
 
 for (int num : arr) {
    System.out.println(num+" ,");
 }
 
    }
}