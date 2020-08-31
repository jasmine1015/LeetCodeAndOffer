/*二分查找*/
func search(nums []int, target int) int {
        if len(nums) == 0 {
            return -1;
        }
        l := 0;
        r := len(nums) - 1;
        for l < r {
            mid := l + ((r - l) >> 1);
            if nums[mid] <= nums[len(nums) - 1] {
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        if target <= nums[len(nums) - 1] {
                r = len(nums) - 1;
        }else{
            l = 0;
            r--;
        }
        for l < r {
            mid := l + ((r - l) >> 1);
            if nums[mid] >= target {
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        if nums[l] == target{return l;}
        return -1;
}

/***/
func search(nums []int, target int) int {
        if len(nums) == 0 {
            return -1;
        }
        l := 0;
        r := len(nums) - 1;
        for l <= r {
            mid := l + ((r - l) >> 1);
            if nums[mid] == target {
                return mid;
            }
            if((nums[l] <= target && target <= nums[mid]) ||
             (nums[mid] <= nums[r] && (target < nums[mid] || target > nums[r]))){
                    r = mid - 1;
            }else{
                l = mid +1;
            }
        }
        return -1;
}