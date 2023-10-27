/*
28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

class Solution {
    public boolean compare(String haystack, String needle, int idx){
        //length of the strings
        int m = haystack.length();
        int n = needle.length();
        //iterate to needle string 
        for(int i=0; i<n; i++){
            //idx is greater then length means needle string not fullfilled
            //string haystack given from args -> haysaybut || needle -> saybutsc
            //so on iterating idx++ start 3 and last 9 
            //compare(9>8)return false
            if(idx>=m){
                return false;
            }
            //if also not give same character return false
            if(haystack.charAt(idx++)!=needle.charAt(i)){
                return false;
            }
        }
        //after all successful iteration return true
        return true;
    }
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        //iterate haystack string from 0 index to her length
        for(int i=0; i<m; i++){
            //if first character of both string haystack and needle matched
            if(haystack.charAt(i)==needle.charAt(0)){
                //then start to find is needle string available in haystack string
                if(compare(haystack, needle, i)){
                    //if true then return her first index
                    return i;
                }
            }
        }
        //else false return -1
        return -1;
    }
}
