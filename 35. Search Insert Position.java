/**
* 二分法
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }

        if (nums[l] >= target)
            return l;

        return n;
    }
}