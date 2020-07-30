/**
* 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
* 你的算法时间复杂度必须是 O(log n) 级别。
* 如果数组中不存在目标值，返回 [-1, -1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l <= r){
            int mid = (l + r) >> 1;
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else if(nums[mid] == target){
                l = mid;
                r = mid;
                while(r+1 < nums.length && nums[r+1] == target){
                    r++;
                }
                while(l-1 >= 0 && nums[l-1] == target){
                    l--;
                }
                return new int[]{l, r};
            }
        }
        return new int[]{-1, -1};
    }
}