import java.util.*;
/**
 * Jewels and Stones
 */
class JewelsAndStones {

    public static void main(String[] args) {   String jewels ="aA";
        String stones ="aAAbbbb";
        int ans=0;
        HashMap <Character,Integer> jewelCount = new HashMap<>();
     
         for(int i=0; i<jewels.length();i++){
            jewelCount.put(jewels.charAt(i),0);
        }
        System.out.println(jewelCount);
        for(int j=0;j<stones.length();j++){
            char stone =stones.charAt(j);
            if(jewelCount.containsKey(stone)){ jewelCount.put(stone,jewelCount.get(stone)+1);}
        }
        for(int k : jewelCount.values()){
            ans=ans+k;
        }
        System.out.println(ans);
    }
}