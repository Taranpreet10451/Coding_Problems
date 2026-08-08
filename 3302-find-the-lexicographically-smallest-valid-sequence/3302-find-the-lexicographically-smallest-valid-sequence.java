class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[] l=new int[m];
        int j=m-1;
        for(int i=n-1;i>=0;i--){
            if(j>=0 && word1.charAt(i)==word2.charAt(j))
            {
                l[j]=i;
                j--;
            }
        }
        int[] ans=new int[m];
        int k=0;
        int s=0;
        j=0;
        for(int i=0;i<n;i++){
            if(j==m){
                break;
            }
            if(word1.charAt(i)==word2.charAt(j) || (s==0 && (j==m-1 || i<l[j+1]))){
                if(word1.charAt(i)!=word2.charAt(j)){
                    s=1;
                }
                ans[k++]=i;
                j++;
            }
        }
        if(j!=m){
            return new int[0];  
        }
        return ans; 
    }
}