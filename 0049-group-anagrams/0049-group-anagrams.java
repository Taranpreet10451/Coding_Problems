class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
                
            }
            map.get(st).add(s);
        }
        return new ArrayList<>(map.values());
    }
}