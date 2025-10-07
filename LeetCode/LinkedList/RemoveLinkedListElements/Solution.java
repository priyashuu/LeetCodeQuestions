/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        if (head == null) return head;
        while(temp.next != null){
            if (temp.next != null && temp.next.val == val){  // temp =2 , tmp.next = 6 = val , 2->3 
             temp.next = temp.next.next;
             
           }else{
           temp = temp.next;}
         
        }
        if (head != null && head.val == val){
            head = head.next;
            return head;
        }
        
return head;
    }
    