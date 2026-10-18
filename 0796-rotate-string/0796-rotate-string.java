class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
            
        String newS="";
        int pos=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(0)){
                pos=i;
                newS=s.substring(pos)+s.substring(0,pos);
                if(newS.equalsIgnoreCase(goal))
                    return true;
            }
        }
        
        return false;
    }
}