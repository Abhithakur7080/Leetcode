/*
 14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // check if null then return an empty prefix string
        if(strs == null || strs.length == 0) {
            return "";
        }
        // set intially first string in array is prefix
        String prefix = strs[0];

        //retrive and set prefix of strings in array
        for(String s : strs){
            // s -> string in array
            // if string s has not any prefix remove last character
            // prefix-> flower
            //s-> flow
            //s.indexOf(prefix) is -1 first prefix= flowe then prefix = flow
            //s == prefix so flower and flow has prefix flow which is similar 
            while(s.indexOf(prefix) != 0 ) {
                //remove 1 character of string fom last
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        //return last prefix
        return prefix;
    }
}