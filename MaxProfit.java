import java.util.*;

public class MaxProfit {
    public static void main(String[] args) {
        int prices[]={893,255,512,534,92,965,172,423};
     
        // int n=prices.length;int max=0;int buy=0,sell=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //        if( (prices[j]-prices[i])>max){
        //         max=prices[j]-prices[i];
        //         buy=i;sell=j;}
        //     }
        // }
        // System.out.println("sell is "+prices[sell]+" buy is "+prices[buy]);
        // System.out.println(prices[sell]-prices[buy]);
        int left = 0, right = 1,max = 0;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }else if(prices[left] < prices[right]){
                max = Math.max(max,(prices[right] - prices[left]));
            }
            right++;
        }
        System.out.println(max);
    }
}
