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
        ArrayList<ListNode>arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        int i = 0,j = arr.size()-1;
        int maxsum = Integer.MIN_VALUE;
        while(i<j){
            int sum = arr.get(i).val + arr.get(j).val;
            if(sum>maxsum) maxsum = sum;
            i++;
            j--;
        }
        return maxsum;
    }
}