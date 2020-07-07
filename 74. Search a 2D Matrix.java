class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int raw = matrix.length;
        int col = matrix[0].length;
        int l = 0, r = col * raw -1;
        while(l < r){
            int mid = l + ((r-l) >> 1);
            if(matrix[mid / col][mid % col] >= target){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        if(matrix[l / col][l % col] != target){
            return false;
        }else{
            return true;
        }
    }
}