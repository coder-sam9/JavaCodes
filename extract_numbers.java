import java.util.*;

public class extract_numbers {
    public static void main(String[] args) {
        String s = "abv345fjjf123tyir45jf6th";
        List <Integer> ans = new ArrayList<Integer>();
        int n = 0;
        int c;
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isDigit(s.charAt(i)) && c != 48) {
                // System.out.println("Number found at " + (i + 1));

                if (!Character.isDigit(s.charAt(i - 1))) {
                    ans.add(  numb(i, s));
                    n++;
                }
            }
        }
        for (int num : ans) {
            System.out.println(num);

        }

        // return ans;/
    }
    public static int numb(int i, String s) {
        int number = 0;
        while ( Character.isDigit(s.charAt(i))) {
            System.out.println("Number found at " + (i + 1)+" "+Character.getNumericValue(s.charAt(i)));

            number = number * 10 + Character.getNumericValue(s.charAt(i));
            i++;
        }
        return number;
    }
}
