/*\
20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //make a stack and store 
        Stack<Character> stack = new Stack<>();

        // example-> (){}[]
        for(char c: s.toCharArray()){

            if(c=='('){//1st true->"(" || again->")" false
                stack.push(')');//stack->[")"]
            }
            else if(c=='{'){//2nd true->"{" || again->"}" false
                stack.push('}');//stack->["}"]
            }
            else if(c=='['){//3rd true->"[" || again->"]" false
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){ 
                // stack pop ")"-> [], stack pop "}"-> [], stack pop "]"-> []
                return false;
            }
        }
        //last stack-> [] empty -> true
        return stack.isEmpty();
    }
}