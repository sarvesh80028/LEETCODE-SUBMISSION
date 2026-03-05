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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        for(int i=0;i<=r+1;i++){
            if(i==l-1) a = temp;
            if(i==l) b = temp;
            if(i==r) c = temp;
            if(i==r+1) d = temp;
            if(temp==null) break;
            temp = temp.next;
        }
        a.next = null;
        c.next = null;
        reverse(b);
        a.next = c;
        b.next = d;
        return dummy.next;
    }
    public void reverse(ListNode b){
        ListNode c = b;
        ListNode p = null;
        ListNode n = null;
        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        // return p;
    }
}