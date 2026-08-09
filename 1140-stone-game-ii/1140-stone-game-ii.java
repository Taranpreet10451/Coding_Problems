class Solution {
    private int[] prefixsum;
    private int n;
    private int[][] dp;
    public int stoneGameII(int[] piles) {
        this.n=piles.length;
        this.prefixsum=new int[n+1];
        this.dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            prefixsum[i+1]=prefixsum[i]+piles[i];
        }
        return findmax(0,1);
    }
    private int findmax(int i,int m){
        if(i>=n)
            return 0;
        int maxstone=0;
        if(dp[i][m]!=0){
            return dp[i][m];
        }
        for(int x=1;x<=2*m && i+x<=n;x++){
            int currentstones=prefixsum[i+x]-prefixsum[i];
            int remainstone=prefixsum[n]-prefixsum[i+x];
            int nextstone=findmax(i+x,Math.max(m,x));
            maxstone=Math.max(maxstone,currentstones+remainstone-nextstone);
        }
        dp[i][m]=maxstone;
        return maxstone;
    }
}