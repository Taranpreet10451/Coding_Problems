class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int o=0;
        for(int x:nums){
            if(x==0)
                o=0;
            else{
                o++;
                ones=Math.max(o,ones);
            }
                
        }
        return ones;
    }
}