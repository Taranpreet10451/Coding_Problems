class Solution {
    public String largestOddNumber(String num) {
        String odd="";
        String s="";
        for(char ch:num.toCharArray()){
            int i=ch-'0';
            s=s+ch;
            if(i%2!=0)
            {
               odd=s;
            }
        }
        return odd;
    }
}