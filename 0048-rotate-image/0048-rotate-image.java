class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] result=new int[r][c];
        
        for(int i=0;i<r;i++){
            int k=0;
            for(int j=c-1;j>=0;j--){
                result[i][k]=matrix[j][i];
                k++;
            }
        }
        for(int x=0;x<r;x++){
            for(int y=0;y<c;y++){
                matrix[x][y]=result[x][y];
            }
        }
    }
}