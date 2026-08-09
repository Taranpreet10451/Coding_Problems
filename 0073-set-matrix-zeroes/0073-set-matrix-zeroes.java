class Solution {
    private int r;
    private int c;
    public void setZeroes(int[][] matrix) {
        this.r=matrix.length;
        this.c=matrix[0].length;
        ArrayList<int[]> zero=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    zero.add(new int[]{i,j});
                }
            }
        }
        for(int[] z:zero){
            setzero(z[0],z[1],matrix);
        }
    }
    private void setzero(int x,int y,int[][] m){
        for(int i=0;i<c;i++){
            m[x][i]=0;
        }
        for(int j=0;j<r;j++){
            m[j][y]=0;
        }
    }
}