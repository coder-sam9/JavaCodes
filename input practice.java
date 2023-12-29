import java.util.*;

class BuyAndSell {
    public static void main(String args[]) {
        int prices[] = { 1, 6, 4, 3, 7 };
        int i, min, max, profit, buy, sell;
        buy = sell = 0;
        min = prices[0];
        max = prices[0];
        for (i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                buy = i;
            }
            if (max < prices[i]) {
                max = prices[i];
                sell = i;
            }
        }
        if (sell > buy) {
            profit = max - min;
        } else
            profit = 0;
        System.out.println("min is " + min + "  and max is" + max);
        System.out.println("profit is " + profit);
    }
}
