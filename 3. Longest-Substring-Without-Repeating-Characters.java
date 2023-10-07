/*
3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
Companies
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //two pointers left and right
        int left = 0, right=0;
        //store set (set not contains any duplicate values)
        HashSet<Character> seen = new HashSet<>();
        int max=0;

        //traverse left to right
        while(right<s.length()){
            //pointed character
            char c = s.charAt(right);
            //if not seen traverse seen add character 
            if(seen.add(c)){
                max = Math.max(max, right-left+1);
                right++;
            }
            //charater if already seen 
            else{
                //if betweent left and right character contains same or duplicate then remove
                while(s.charAt(left) != c){
                    //remove duplicate characters
                    seen.remove(s.charAt(left));
                    left++;
                }
                //also remove where pointed character
                seen.remove(c);
                left++;
            }
        }
        return max;
    }
}