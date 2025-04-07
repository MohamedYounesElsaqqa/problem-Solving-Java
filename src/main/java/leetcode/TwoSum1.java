package leetcode;

import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int complement = target-nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        int[] nums = {1,4,2,74,11,5,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("The two numbers are: " + nums[result[0]] + " and " + nums[result[1]]);
    }
}
