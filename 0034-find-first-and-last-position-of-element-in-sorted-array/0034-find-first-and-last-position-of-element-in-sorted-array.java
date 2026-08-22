class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=find(nums,target,true);
        result[1]=find(nums,target,false);
        return result;
    }
    private int find(int[] n,int tar,boolean flag){
        int i=-1;
        int ub=n.length-1;
        int lb=0;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(n[mid]==tar){
                i=mid;
                if(flag){
                    ub=mid-1;
                }
                else{
                    lb=mid+1;
                }
            }
            else if(n[mid]>tar){
                ub=mid-1;
            }
            else
                lb=mid+1;
        }
        return i;
    }
}