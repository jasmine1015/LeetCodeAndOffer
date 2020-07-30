class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int  i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int s = i + 1, l =  nums.length - 1, sum = 0 - nums[i];
                while (s < l) {
                    if (nums[s] + nums[l] == sum) {
                        res.add((Arrays.asList(nums[i], nums[s], nums[l])));
                        while (s < l && nums[s] == nums[s+1]) s++;
                        while (s < l && nums[l] == nums[l-1]) l--;
                        s++; l--;
                    } else if (nums[s] + nums[l] < sum) {
                        s++;
                    } else {
                        l--;
                    }

                }
            }
        }
        return res;
    }
}