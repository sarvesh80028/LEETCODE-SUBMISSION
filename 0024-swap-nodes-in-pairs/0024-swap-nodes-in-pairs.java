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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-2);
        ListNode i = d1;
        ListNode j = d2;
        int idx = 0;
        ListNode k = head;
        while(k!=null){
            if(idx%2==0){
                i.next = k;
                i = i.next;
            }
            else{
                j.next = k;
                j = j.next;
            }
            k = k.next;
            idx++;
        }
        i.next = null;
        j.next = null;
        i = d2.next;
        j = d1.next;
        ListNode d3 = new ListNode(-1);
        ListNode l = d3;
        while(i!=null && j!=null){
            l.next = i;
            i = i.next;
            l = l.next;

            l.next = j;
            l = l.next;
            j = j.next;
        }
        
        
        return d3.next;
    }
}