/**
* 暴力枚举
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            boolean ok = true;
            for (int j = 0; j < m; j++)
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    ok = false;
                    break;
                }
            if (ok)
                return i;
        }
        return -1;
    }
}