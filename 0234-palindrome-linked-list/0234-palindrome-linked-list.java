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
    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode>arr = new ArrayList<>();
        ListNode p = null;
        ListNode c = head;
        ListNode n = null;
        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        ListNode temp = p;
        while(p!=null && head!=null){
            if(p.val!=head.val) return false;
            p = p.next;
            head = head.next;
        }
        return true;
    }
}