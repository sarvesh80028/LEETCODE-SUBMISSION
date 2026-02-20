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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        if(head==null || (head.next==null && head.val!=val)) return head;
        ArrayList<ListNode>arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i).val==val){
                arr.remove(i);
            }
        }
        for(int i=0;i<arr.size()-1;i++){
            arr.get(i).next = arr.get(i+1);
        }
        if(arr.size()==0) return null;
        arr.get(arr.size()-1).next = null;
        return arr.get(0);
    }
}