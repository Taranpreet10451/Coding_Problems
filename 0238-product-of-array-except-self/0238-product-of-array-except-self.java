class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int rp=1;
        for(int j=n-1;j>=0;j--){
            result[j]*=rp;
            rp*=nums[j];
        }
        return result;
    }
}