/*
 9. Palindrome Number
Solved
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 */

 class Solution {
    public boolean isPalindrome(int x) {
        //palidrome is the reverse of itself is same-> 121<->121(IN NUMBER) // baab<->baab(IN STRING)
        //if x==0 then also not palidrome
        if(x<0) return false;
        int rem=0, rev=0; //initially reverse=0 and remainder=0
        //initially temp is x //as x=121 also temp=121
        int temp = x;
        //x!=0 // x!=0 // x!=0 // x==0 -> terminate loop
        while(x!=0) {
            //reminder = 121/10 = 1 // reminder = 12/10 = 2 // reminder = 1/10 = 1
            rem = x%10;//rem=1 //rem=2 // rem=1
            //reverse no. = 0*10 + 1 = 1 //reverse no. = 1*10 + 2 = 12 //reverse no. = 12*10 + 1 = 121
            rev = rev*10 + rem; //rev=1 // rev=12  // rev=121
            //quotient = x= 121/10 = 12 //quotient = x= 12/10 = 1 //quotient = x= 1/10 = 0 
            x /= 10; // x=12 // x=1 // x=0
        }
        //rev=121 //temp=121
        return temp == rev; // check if temp is equal to the reverse
    }
}
