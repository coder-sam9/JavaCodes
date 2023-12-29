
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        String red="💓️️️";
        String white="🤍";
        String black="🖤";
        String green="💚";
        System.out.println("Enter the value in length and breath , enter in 3/4 ration like 9:12 " );
        System.out.println("where length means no.of lines to be printed");
        int a=sc.nextInt();
        System.out.println("where breadth means number of hearts to be printed in a lines");
        int b=sc.nextInt();
        // int a=9;
        // int b=12;
        int x;
        for(int i=1;i<=a;i++){
             if (i < (a / 2) + 1) {
                x = i;
            } else {
                x =a - i + 1;
            }
            System.out.print(x+"   ");
            for(int j=x;j>0;j--){
                System.out.print(red);
            }
            for(int k=x;(k<=b&&i<=3);k++){
                System.out.print(black);
            }
             for(int l=x;(l<=b&&i>(a/3)&&i<=(2*a/3));l++){
                System.out.print(white);
            }
             for(int m=x;(m<=b&&i>(2*a/3));m++){
                System.out.print(green);
            }
            System.out.println("\n");
        }
    }
}