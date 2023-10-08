/*
4. Median of Two Sorted Arrays
Solved
Hard
Topics
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length; // nums1-> [1,3] m=2
        int n = nums2.length; // nums2-> [2] n=1
        int ans[] = new int[m+n]; // ans-> [0,0,0] size=m+n=3
        int i=0, j=0, k=0; // i-index of nums1 / j-index of nums2 / k-index of ans
            //0<2 && 0<1 // 1<2 && 0<1 // 1<2 && 1<1 -> false terminate
        while(i<m && j<n){ //i=0/j=0 
            //1<2->true //3<2->false
            if(nums1[i]<nums2[j]){
                //ans[0] = 1
                ans[k] = nums1[i];
                i++;//i=1
            }
            //false condition...
            else{
                //ans[1] = 2
                ans[k] = nums2[j];
                j++; // j=1
            }
            k++;//k=1 // k=2
        }
        //updated kth array ans[] = { 1, 2, 0} / i=1, / j=1 / k= 2
        //but 1 element remain
        // if element from nums1
        //1<2 // 2<2 -> false
        while(i<m){
            //ans[2] = 3
            ans[k] = nums1[i];
            i++; // i=2
            k++; // k=3
        }
        // if elemen remain from num2
        while(j<n){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        // if size of ans array is odd also give 1 medium
        if((m+n)%2!=0){
            return ans[(m+n)/2]; //size of medium/2 is 1 index which is medium of array 
        }
        else{
            int x = (m+n)/2; //it gives max index from 2 medium index of array like x=3(medium -> 2,3)
            double p = ans[x]; // like as medium index 3
            double q = ans[x-1];// like as medium index 2
            return (p+q)/2; // like as medium of index 2 and 3 element
        }
    }
}