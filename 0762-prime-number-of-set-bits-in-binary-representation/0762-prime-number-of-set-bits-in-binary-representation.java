class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int c=count_set_bits(i);
            if(prime(c))
                count++;
        } 
        return count;  
    }
    private boolean prime(int i)
    {
        if(i<=1)
            return false;
        for(int j=2;j<=(int)(Math.sqrt(i));j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
    private int count_set_bits(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }
        return c;
    }
}