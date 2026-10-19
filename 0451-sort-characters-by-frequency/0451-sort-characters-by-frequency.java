class Solution {
    public String frequencySort(String s) {
        StringBuilder result=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }

        List<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);

        for(int val:list){
            for(char ch:map.keySet()){
                if(map.get(ch)==val){
                    int v=map.get(ch);
                    while(v!=0){
                        result.append(ch);
                        v--;
                    }
                    map.put(ch,v);
                }
            }
        }
        return result.reverse().toString();
    }
}