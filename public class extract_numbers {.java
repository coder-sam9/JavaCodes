public class extract_numbers2 {
    public static void main(String[] args) {
        String s = "abv345fjjf123tyir45jf6th";
        int ans[] = {0, 0, 0, 0, 0};
        int n = 0;
        int j = 0;
        int c;
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isDigit(s.charAt(i)) && c != 48) {
                System.out.println("Number found at " + (i + 1));
                if (!Character.isDigit(s.charAt(i - 1))) {
                    ans[j++] = numb(i, s);
                    n++;
                }
            }
        }
        for (int num : ans) {
            System.out.println(num);
        }
        // return ans;/
    }
    public static int numb(int i,String s){
        int number=0;
        while(i< s.length() && Character.isDigit(s.charAt(i))){
        number=number*10+Integer.valueOf(s.charAt(i));
        i++;
        }
        return number;
        }
}
