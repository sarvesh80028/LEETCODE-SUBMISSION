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
    public int pairSum(ListNode head) {
       ListNode s = head;
       ListNode f = head;
       while(f.next!=null && f.next.next!=null){
        s = s.next;
        f = f.next.next;
       }
       ListNode head2 = s.next;
       s.next = null;
       ListNode c = head2;
       ListNode p = null;
       ListNode n = null;
       while(c!=null){
        n = c.next;
        c.next = p;
        p = c;
        c = n;
       }
       ListNode i = head;
       ListNode j = p;
       int maxsum = Integer.MIN_VALUE;
       while(i!=null && j!=null){
            int sum = i.val + j.val;
            if(sum>maxsum) maxsum = sum;
            i = i.next;
            j = j.next;
       }
       return maxsum;
    }
}