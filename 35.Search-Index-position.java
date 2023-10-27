/*
35. Search Insert Position
Solved
Easy
Topics
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */

 class Solution {
    public int searchInsert(int[] nums, int target) {
        //start position
        int s = 0;
        //end position
        int e = nums.length-1;
        //if start < end then loop else terminate the loop
        while(s<=e){
            //mid position
           int m = (s + e)/2;
           //if target is in array then return index
           if(nums[m] == target){
            //index is mid index
               return m;
           }
           //if target is not in array and found target greater than array element
           else if(nums[m]<target){
            //update start position to mid + 1
               s = m+1;
           }
           //if target is not in array and found target lesser than array element
           else if(target<nums[m]){
            //update end position to mid - 1
               e = m-1;
           }
        }
        //at last updated start position return
        return s;
    }
}