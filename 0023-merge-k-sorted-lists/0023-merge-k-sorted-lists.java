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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ArrayList<ListNode>list1 = new ArrayList<>();
        ArrayList<ListNode>list2 = new ArrayList<>();
        for(ListNode n:lists){
            list1.add(n);
        }
        while(list1.size() + list2.size()>1){
            while(list1.size()>1){
                ListNode a = list1.remove((list1.size()-1));
                ListNode b = list1.remove((list1.size()-1));
                ListNode c = merge(a,b);
                list2.add(c);
            }
            while(list2.size()>1){
                ListNode a = list2.remove((list2.size()-1));
                ListNode b = list2.remove((list2.size()-1));
                ListNode c = merge(a,b);
                list1.add(c);
            }
            if(list1.size()==1 && list2.size()==1){
                ListNode a = list1.remove(list1.size()-1);
                ListNode b = list2.remove(list2.size()-1);
                ListNode c = merge(a,b);
                return c;
            }
        }
        if(list1.size()==1) return list1.get(0);
        return list2.get(0);
    }
    public ListNode merge(ListNode a,ListNode b){
        if(a==null) return b;
        if(b==null) return a;
        ListNode i = a;
        ListNode j = b;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(i!=null && j!=null){
            if(i.val<j.val){
                temp.next = i;
                i = i.next;
                temp = temp.next;
            }
            else{
                temp.next = j;
                j = j.next;
                temp = temp.next;
            }
           if(i!=null){
            temp.next = i;
            
           }
           if(j!=null){
            temp.next = j;
        
           }
           
        }
        return dummy.next;
    }
}