class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
        {
            return nums[0]==target?0:-1;
        }
        int ul=nums.length-1;
        int ll=0;
        while(ll<=ul){
            int mid=(ll+(ul-ll)/2);
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                ul=mid-1;
            }
            else
                ll=mid+1;
        }
        return -1;
    }
}