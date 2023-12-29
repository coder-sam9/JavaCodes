class FirstAndLastOccurence{
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int low=0,high=nums.length-1, mid,i=1,target=8;
        int[] res={-1,-1};
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){ 
                res[i--]=mid;
                System.out.println("target found at "+mid +" with value of "+target);
                if(i < 0) break;}
            if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
       for (int j = 0; i <= 1; i++) {
            System.out.print("\n" +res[j]);
        }
        System.out.println();
    } 
}