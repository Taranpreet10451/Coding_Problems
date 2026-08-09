class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)==1)
                return k;
        }
        return -1;
    }
}