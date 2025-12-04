class Solution {
    public int countCollisions(String directions) {
        int n=directions.length();
        if(n==1)
            return 0;
        int l=0;
        int r=n-1;
        while(l<n && directions.charAt(l)=='L')
        {
            l++;
        }
        while(r>=0 && directions.charAt(r)=='R')
        {
            r--;
        }
        int collisions=0;
        while(l<=r)
        {
            collisions+=(directions.charAt(l)!='S'?1:0);
            l++;
        }
        return collisions;
    }
}