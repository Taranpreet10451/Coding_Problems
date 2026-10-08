class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        
            int start=0;
            int end=r*c-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                int i=mid/c;
                int j=mid%c;
                if(matrix[i][j]==target)
                    return true;
                else if(matrix[i][j]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        
        return false;
    }
}