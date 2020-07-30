/**
* 一个整形数组，其他数都出现两次，只有一个数出现一次，找出这个数
* 异或
* 两个相同的数异或是0
* 和0异或是自己
*/
public class test{
    public static void main(String[] args){
        int []test = new int[]{1, 1, 2, 3, 3};
        int res = findSimple(test);
        System.out.println(res);
    }
    public static int findSimple(int[] nums){
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
/**
* hashmap
* key为元素，value是出现的次数
*/