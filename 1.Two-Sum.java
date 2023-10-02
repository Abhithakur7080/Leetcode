/*
 1. Two Sum
Easy
52K
1.7K
Companies
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //making a new map to store all the value of array in map.
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            //initially map has empty.
            //check if map has available target - array[i] value 
            //2nd array[i] value = target - 1st array[i]
            //it means 1st array[i] value + 2nd array[i] value = target
            //in map we find 2nd array[i] value.
            //if available then return new array inside both 1st and 2nd array index
            if(map.containsKey(target - nums[i])) return new int[] {map.get(target - nums[i]), i};
            //else add array value with index.
            else map.put(nums[i], i);
        }
        // if not found then return blank array
        return new int[] {};
    }
}