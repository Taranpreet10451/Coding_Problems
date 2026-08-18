class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        
        int j=1;
        while(j<=numRows){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            if(j>1){
                List<Integer> prev=triangle.get(j-2);
                for(int i=1;i<j-1;i++){
                    int a=prev.get(i);
                    int b=prev.get(i-1);
                    row.add(a+b);
                }
                row.add(1);
            }
            triangle.add(row);
            j++;
        }
        return triangle;
    }
}