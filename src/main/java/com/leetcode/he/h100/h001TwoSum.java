package com.leetcode.he.h100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hefl
 * @date 2022/3/21 21:20
 * TODO 两数之和
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class h001TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + "," + ints[1]);


        int[] nums1 = {3,2,4};
        int target1 = 6;
        int[] ints1 = twoSum(nums1, target1);
        System.out.println(ints1[0] + "," + ints1[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 判断是否存在map中，如果不存在，则put 9-2 为key 0为value
            if(map.containsKey(nums[i])){
                //如果存在 则赋值
                indexs[0] = map.get(nums[i]);
                indexs[1] = i;
                return indexs;
            }
            map.put(target - nums[i], i);
        }

        return indexs;

    }
}
