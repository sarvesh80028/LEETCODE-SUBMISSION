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
    public ListNode insertionSortList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len==1) return head;
        temp = head;
        for(int i=0;i<len-1;i++){
            temp = head;
            while(temp.next!=null){
                int x = temp.val;
                int y = temp.next.val;
                if(x>y){
                    temp.val = y;
                    temp.next.val = x;
                }
                temp = temp.next;
            }
        }
        return head;
    }
}