class Solution {
    public boolean checkDivisibility(int n) {
        int sum=sumOfProdDig(n);
        return n%sum==0;
    }
    private int sumOfProdDig(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n=n/10;
        }
        return sum+prod;
    }
}