class Solution {
    public int subarraySum(int[] arr, int k) {
        int j=0;
        int n=arr.length;
        int size=0;
        while(j!=n){
            int sum=0;
            for(int x=j;x<n;x++){
                sum+=arr[x];
                if(sum==k){
                    size++;   
                }
            }
            j++;
        }
        return size;
    }
}