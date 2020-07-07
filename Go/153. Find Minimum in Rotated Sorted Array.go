func findMin(nums []int) int {
    if len(nums) == 0 {
        return 0;
    }
    l := 0;
    r := len(nums) - 1;
    for l < r {
        mid := (l + r) >> 1;
        if nums[mid] <= nums[len(nums) - 1] {
            r = mid;
        }else{
            l = mid + 1;
        }
    }
    return nums[r];
}