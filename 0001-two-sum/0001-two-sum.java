class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int m=target-nums[i];
            if(map.containsKey(m)){
                result[0]=map.get(m);
                result[1]=i;
            }
            else{
                map.put(n,i);
            }
        }
        return result;
    }
}