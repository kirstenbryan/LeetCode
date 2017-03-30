/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode n1 = new ListNode(-1);
        ListNode n2 = new ListNode(-1);
        n1.next = l1;
        n2.next = l2;
        
        while(n1.next != null) {
            if(n2.next != null) {
                n1.next.val += n2.next.val;
                n1 = n1.next;
                n2 = n2.next;
            }
            else
                break;
        }
        if(n2.next != null) {
            n1.next = n2.next;
        }
        n1 = l1;
        while(n1.next != null) {
            if(n1.val >= 10) {
                n1.val -= 10;
                n1.next.val += 1;
            }
            n1 = n1.next;
        }
        if(n1.val >= 10) {
            n1.val -= 10;
            n1.next = new ListNode(1);
        }
        return l1;
    }
}
