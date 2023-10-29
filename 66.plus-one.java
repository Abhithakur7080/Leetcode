/*
66. Plus One
Solved
Easy
Topics
Companies
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

class Solution {
    public int[] plusOne(int[] digits) {
        //initially carry is 1 which 1 is add in last
        int carry = 1;
        //iterate from last because in math we add start from last
        for(int i=digits.length-1; i>=0; i--){
            //sum store start from last and add with carry
            int sum = digits[i]+carry;
            //also on that index position set if sum <10 
            //else add only more than 10 value and other goes to carry
            digits[i] = sum%10;
            // carry added to when sum is exceeded to 10
            carry = sum/10;
        }
        //if remain carry is 1
        if(carry==1){
            // make new index and add carry in 0th index
            digits = new int[digits.length + 1];
            digits[0] = carry;
        }
        //also return updated array
        return digits;
    }
}