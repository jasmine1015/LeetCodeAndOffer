/**
* 做法：
* 用两个指针 i,j i,j 分别指向首尾，
* 如果 a[i]>a[j]，则 j−−；否则 i++，直到 i=j 为止，每次迭代更新最大值。
*/
/**
* 证明：
* https://www.acwing.com/solution/LeetCode/content/100/
*/
class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for(int i = 0, j = height.length - 1; i < j;){
            int area = Math.min(height[i], height[j]) * (j - i);
            res = Math.max(area,res);
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}