class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        int i=0;
        for(int x:nums){
            if(x==0) 
                zero++;
            else if(x==1) 
                one++;
            else 
                two++;
        }
        while(zero!=0){
            nums[i]=0;
            i++;
            zero--;
        }
        while(one!=0){
            nums[i]=1;
            i++;
            one--;
        }
        while(two!=0){
            nums[i]=2;
            i++;
            two--;
        }
    }
}