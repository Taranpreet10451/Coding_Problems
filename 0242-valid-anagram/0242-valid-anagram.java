class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int j=0;j<t.length();j++){
            char c=t.charAt(j);
            if(map.containsKey(c)){
                map.put(c,(map.get(c))-1);
            }
            else{
                return false;
            }
        }
        for(char k:map.keySet()){
                if(map.get(k)!=0){
                    return false;
            }
        }
        return true;
    }
}