/**
* 无重复字符的最长子串
* HashMap
* 如果s[j]在[i,j）范围内存在有与j1重复的字符，不需要逐渐增加i，直接跳过[i,j1）范围所有字符，将i 变为j1+1
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0,j = 0; j< s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return result;
    }
}