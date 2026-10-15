class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int i=0;
        while(i<nums.length){
            int el=nums[i];
            int s=0+el;
            if(s==k)
                count++;
            for(int j=i+1;j<nums.length;j++){
                int e=nums[j];
                s+=e;
                if(s==k)
                    count++;
            }
            
            i++;
        }
        
        return count;
    }
}