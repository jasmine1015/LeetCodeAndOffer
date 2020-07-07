class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0, r = nums.length - 1;
        while(l < r){
            int mid = l + ((r - l) >> 1);
            if(nums[mid] <= nums[nums.length - 1]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return nums[r];
    }
}