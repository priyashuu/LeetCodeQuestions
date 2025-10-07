/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0 ; int sizeB = 0 ;
        ListNode tempA = headA; ListNode tempB = headB;
        while (tempA != null){
            sizeA ++ ;
            tempA = tempA.next;
        }
        while (tempB != null){
            sizeB ++ ;
            tempB = tempB.next;
        }
       tempA = headA;
       tempB = headB;
       if (sizeA > sizeB){
         int steps = sizeA- sizeB;
         for (int i = 0 ; i <steps ; i++) {
            tempA = tempA.next ;
         }
       }
       else{
        int steps = sizeB- sizeA;
         for (int i = 0 ; i <steps ; i++) {
            tempB = tempB.next ;
         }
       }  
        while (tempA != tempB){
            tempA = tempA.next ;
            tempB = tempB.next ;
            
        }
        return tempA;      
    }
}