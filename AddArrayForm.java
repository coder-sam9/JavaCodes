import java.util.*;

public class AddArrayForm {
    public static void main(String[] args) {
        /*long ans=0;int k=1; long pow=0; int num[]={9,9,9,9,9,9,9,9,9,9};
        int digit=0;
        
        int l=num.length-1;
        for(int i=0;i<=l;i++){
            pow=(long)Math.pow(10, l-i);
            System.out.println(pow);
            long temp=num[i]*pow;
            ans=ans+temp;
        }
        ans=ans+k;
        System.out.println(ans);
        for(int j=0;j<=l;j++){
            pow=(long)Math.pow(10, l-j);
            digit=(int)ans/pow;
            if (digit==10) {result.add(1);result.add(0);}
            else result.add(digit);
            ans=ans%pow;

        }
        */List <Integer> result= new ArrayList<>();
        int i=1234;int pow=10;
        while(i>0){
            int digit=i%10;
            System.out.print(digit);
            i=i/10;
            pow=pow*10;
            result.add(digit);
        }System.out.println(result);
    }

}
