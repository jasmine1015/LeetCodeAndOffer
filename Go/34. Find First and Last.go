func searchRange(nums []int, target int) []int {
    n := len(nums);
    for l, r := 0, n-1; l <= r; {
        mid := (l + r) >> 1;
        if nums[mid] > target {
            r = mid - 1;
        }else if nums[mid] < target {
            l = mid + 1;
        }else{
            l = mid;
            r = mid;
            for (r+1 < n && nums[r+1] == target){
                r ++;
            }
            for (l-1 >= 0 && nums[l-1] == target){
                l --;
            }
            return []int{l, r};
        }
    }
    return []int{-1, -1};
}