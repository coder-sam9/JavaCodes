class FindPeakElement{
    public static void main(String[] args) {
        int nums[]={1,6,4,6,7,8,1,9,12};
        int low=0;
        int high=nums.length-1;
        while(low<high){
            System.out.print("the low now is "+low+" nd value "+nums[low]);
            System.out.println(" the high now is "+high+" nd value "+nums[high]);
            int   mid=(low+(high-1))/2;
            System.out.println(mid +" is mid and  its value is "+nums[mid]);
          
            if(nums[mid]>nums[mid+1]) high=mid;
            else low=mid+1;
            System.out.println("the value of mid now is "+mid+" nd its value is "+nums[mid]);  System.out.println();
        }
        // return low;
        System.out.println("peak value is "+nums[low]+" at index "+low);
    }
}