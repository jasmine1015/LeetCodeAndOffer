func searchInsert(nums []int, target int) int {
    n := len(nums);
    if (n == 0 || nums[n-1] < target){
        return n;
    }
    l := 0;
    r := n - 1;
    for l < r {
        mid := (l + r) >> 1;
        if nums[mid] >= target {
            r = mid;
        }else{
            l = mid + 1;
        }
    }
    return r;
}