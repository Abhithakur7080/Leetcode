/*
2. Add Two Numbers
Medium
28.5K
5.5K
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

//  * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode p = l1;  //initially l1 node target to p
        ListNode q = l2; //initially l2 node target to q
        ListNode curr = ans; //initially current node target to ans
        int carry = 0; // carry set initially 0;
        while(p!=null || q!=null){
            //check if l1 not have null then insert value in x else set to 0. like l1 value = 9, x=9
            int x = (p!=null)?p.val:0;
            //check if l2 not have null then insert value in x else set to 0. like l2 value = 7, x=16
            int y = (q!=null)?q.val:0;
            //sum of both x and y and carry also. like sum = x+y+carry->9+7+0=16
            int sum = x+y+carry;
            // carry gives right one value another carried to next node--> 16/10=1 so, carry = 1
            carry = sum/10;
            // node set the value like as 16%10=6
            curr.next = new ListNode(sum%10);
            //current node pointing to next current node
            curr = curr.next;
            //if not null value then p node pointing to next p node.
            if(p!=null) p = p.next;
            //if not null value then q node pointing to next q node.
            if(q!=null) q = q.next;
        }
        // if carry remain more than 1 then also make new node and value is carry.
        if(carry>0) {
            curr.next = new ListNode(carry);
        }
        return ans.next;
    }
}