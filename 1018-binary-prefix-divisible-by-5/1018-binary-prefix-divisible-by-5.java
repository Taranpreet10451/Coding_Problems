class Solution {
    List<Boolean> result;
    public List<Boolean> prefixesDivBy5(int[] nums) {
        result=new ArrayList<>();
        long curr=0;
        for(int i:nums)
        {
            curr=((curr<<1)+i)%5;
            result.add(curr==0);
        }
        return result;
    }
}