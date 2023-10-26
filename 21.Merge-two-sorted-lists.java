/*
21. Merge Two Sorted Lists
Solved
Easy
Topics
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/

//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //intitially temp is positioned at 0
        ListNode temp = new ListNode(0);
        //set current node to temp node
        ListNode curr = temp;

        //loop iterate when both list1 and list2 is null
        while(list1 != null && list2 != null){
            //if list2 value is greater than list1
            if(list1.val < list2.val){
                //set next current node to list1 node
                curr.next = list1;
                //set list1 to next node in list1 node
                list1 = list1.next;
            }
            //if list1 value is greater than list2
            else{
                //set next current node to list2 node
                curr.next = list2;
                //set list2 to next node in list2 node
                list2 = list2.next;
            }
            //set current to next current node which is set previously list1 or list2 node
            curr = curr.next;
        }
        //after iterating if remains list 1 node then add in next current node
        if(list1 != null){
            //set next current node to list1 node
            curr.next = list1;
            //set list1 to next node in list1 node
            list1 = list1.next;
        }
        //after iterating if remains list 2 node then add in next current node
        if(list2 != null){
            //set next current node to list2 node
            curr.next = list2;
            //set list2 to next node in list2 node
            list2 = list2.next;
        }
        // next temp node is current node but initially at 0 position
        //so return next temp node
        return temp.next;
    }
}
