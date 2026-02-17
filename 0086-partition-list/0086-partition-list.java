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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode i = dummy1;
        ListNode j = dummy2;
        ListNode k = head;

        while(k!=null){
            if(k.val<x){
                i.next = k;
                i = i.next;
                k = k.next;
            }
            else if(k.val>=x){
                j.next = k;
                j = j.next;
                k = k.next;
            }
        }
        i.next = dummy2.next;
        j.next = null;
        return dummy1.next;
    }
}