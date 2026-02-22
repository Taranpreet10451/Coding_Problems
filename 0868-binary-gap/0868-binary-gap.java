class Solution {
    public int binaryGap(int n) {
        n>>=Integer.numberOfTrailingZeros(n);
        if(n==1)
            return 0;
        int m_gap=0, gap=0;
        while(n>0){
            if((n&1)==1){
                m_gap=Math.max(m_gap,gap);
                gap=0;
            }
            else{
                gap++;
            }
            n>>=1;
        }
        return m_gap+1;
    }
}