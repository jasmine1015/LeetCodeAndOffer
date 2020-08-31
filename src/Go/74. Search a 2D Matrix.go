func searchMatrix(matrix [][]int, target int) bool {
    if (matrix == nil || len(matrix) == 0 || len(matrix[0]) == 0){
        return false;
    }
    row := len(matrix);
    rol := len(matrix[0]);
    l := 0;
    r := row * rol -1;
    for l < r {
        mid := l + ((r - l) >> 1);
        if matrix[mid / rol][mid % rol] >= target {
            r = mid;
        }else{
            l = mid + 1;
        }
    }
    if matrix[r / rol][r % rol] != target {
        return false;
    }
    return true;

}