func findPeakElement(nums []int) int {
    l := 0;
    r := len(nums) - 1;
    for l < r {
        mid := l + ((r - l) >> 1);
        if nums[mid] > nums[mid + 1] {
            r = mid;
        }else{
            l = mid + 1;
        }
    }
    return l;
}