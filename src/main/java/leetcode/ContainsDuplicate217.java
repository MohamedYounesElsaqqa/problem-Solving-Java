package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate217 {
    /*
    Given an integer array nums,
    return true if any value appears at least twice in the array,
     and return false if every element is distinct.
     Input: nums = [1,2,3,1]
     Output: true or false
     */
    public static boolean containsDuplicate(int[] nums) {
        //create hashset to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num :nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1};
        System.out.println(containsDuplicate(nums));
    }

}
