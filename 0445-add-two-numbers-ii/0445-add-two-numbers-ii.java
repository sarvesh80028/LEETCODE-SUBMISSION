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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode c1 = head1;
        ListNode p1 = null;
        ListNode n1 = null;
        while(c1!=null){
            n1 = c1.next;
            c1.next = p1;
            p1 = c1;
            c1 = n1;
        }
        ListNode c2 = l2;
        ListNode p2 = null;
        ListNode n2 = null;
        while(c2!=null){
            n2 = c2.next;
            c2.next = p2;
            p2 = c2;
            c2 = n2;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(p1!=null || p2!=null || carry!=0){
            int sum = carry;
            if(p1!=null){
                sum+=p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                sum+=p2.val;
                p2 = p2.next;
            }
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
        }
        temp.next = null;
        ListNode c3 = dummy.next;
        ListNode p3 = null;
        ListNode n3 = null;
        while(c3!=null){
            n3 = c3.next;
            c3.next = p3;
            p3 = c3;
            c3 = n3;
        }
        return p3;
    }
}