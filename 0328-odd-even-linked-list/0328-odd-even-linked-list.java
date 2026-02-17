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
    public ListNode oddEvenList(ListNode head) {
        int idx = 0;
        ListNode d1 = new ListNode(-1);
        ListNode i = d1;
        ListNode d2 = new ListNode(-1);
        ListNode j = d2;
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
            idx++;
            k = k.next;
        }
        i.next = d2.next;
        j.next = null;
        return d1.next;
    }
}