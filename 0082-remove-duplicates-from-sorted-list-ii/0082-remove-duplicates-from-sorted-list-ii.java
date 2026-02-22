import java.util.ArrayList;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;

        // store nodes in array
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        for(int i = arr.size() - 1; i > 0;){
            if(arr.get(i).val == arr.get(i-1).val){
                int dup = arr.get(i).val;
                while(i >= 0 && arr.size() > 0 && arr.get(i).val == dup){
                    arr.remove(i);
                    i--;
                }
            }
            else{
                i--;
            }
        }
        if(arr.size() == 0) return null;
        for(int i = 0; i < arr.size() - 1; i++){
            arr.get(i).next = arr.get(i+1);
        }
        arr.get(arr.size()-1).next = null;

        return arr.get(0);
    }
}