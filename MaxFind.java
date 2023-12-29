class MaxFind{
    public static void main(String[] args) {
        int nums[]={2,3,5,1,3};
        nums[4]=nums[4]+3;
        int max=nums[0];
        for(int j=0;j<nums.length;j++){
            if(nums[j]>max) max=nums[j];
        }
        System.out.println();
        for(int j=0;j<nums.length;j++){
           System.out.print(nums[j]+" ");
        }
        System.out.println("\n"+ max);
        System.out.println(nums[4]);
    }
}