/*
69. Sqrt(x)
Solved
Easy
Topics
Companies
Hint
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
 */

class Solution {
    public int mySqrt(int x) {
        //initially if x is 0 then return x, sqrt(0)->0
        if(x==0){
            return x;
        }
        //at first is 1
        int first =1;
        //last is x value
        int last = x;
        //loop iterate when first is less than or equal to last
        while(first<=last){
            //mid is also the half of (first+last) value
            int mid = (first+last)/2;
            //if mid is x/mid then sqrt is mid--> 2==4/2 so, 2 is mid, sqrt(4) is 2
            if(mid == x/mid){
                return mid;
            }
            //if x/mid is greater than mid then add 1 to first
            else if(mid < x/mid){
                first = mid+1;
            }
            //if x/mid is lesser than mid then remove 1 to last
            else if(mid > x/mid){
                last = mid-1;
            }
        }
        //return last updated value
        return last;
    }
}
