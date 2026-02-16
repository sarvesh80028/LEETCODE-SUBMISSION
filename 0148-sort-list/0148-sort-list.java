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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
      head = sortList(head);
      head2 = sortList(head2);
     head = merge(head,head2);
     return head;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp3 = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                dummy.next = temp1;
                dummy = dummy.next;
                temp1 = temp1.next;
            }
            else{
                dummy.next = temp2;
                dummy = dummy.next;
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            dummy.next = temp2;
        }
        else{
            dummy.next = temp1;
        }
        return head.next;
    }
}