import java.util.*;
class DisappearingElements{
    public static void main(String[] args) {

int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> disappear = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int ind= Math.abs(nums[i])-1;
            if (nums[ind]<0) continue;
            nums[ind]=nums[ind]*-1;
    }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0){
                disappear.add(j+1);
            }
        }
    }
}

