class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str=new StringBuilder();
        StringBuilder result=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(str.indexOf(String.valueOf(curr))==-1){
                str.append(curr);
            }
            else{
                str.delete(0,str.indexOf(String.valueOf(curr))+1);
                str.append(curr);
            }
            if(result.length()<str.length()){
                result=new StringBuilder(str);
            }
        }
        return result.length();
    }
}