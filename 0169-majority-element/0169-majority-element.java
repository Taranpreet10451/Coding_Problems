class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int limit=nums.length/2;
        int ans=-1;
        for(int x:nums)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>limit)
                ans=e.getKey();
        }
        return ans;
    }
}