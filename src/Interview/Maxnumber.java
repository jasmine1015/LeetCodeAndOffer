// 给定一个包含大写英文字母和数字的句子，找出这个句子所包含的最大的十六进制整数，
// 返回这个整数的值。数据保证该整数在int表示范围内
// 0<字符串长度<=105

// 输入："012345BZ16"
// 输出：1193051
// 说明: 12345B对应十进制为1193051

import java.util.*;
public class Solution {
    /**
     * @param s string字符串
     * @return int整型
     */
    public int solve (String s) {
        // write code here
        int begin = 0;
        int end = 0;
        int result = 0;
//         求合法连续子字符串的最大值，不断更新结果。遇到不合法大写字母，子字符串的开始Index和结束Index都要更新。
        for(int i = 0; end < s.length(); i++) {
            if ( (Character.isDigit(s.charAt(i))) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'F') ) {
                end++;
                result = Math.max(Integer.parseInt(s.substring(begin, end),16), result);
            } else {
                begin = i+1;
                end = begin;
            }
        }
        return result;
    }
}
