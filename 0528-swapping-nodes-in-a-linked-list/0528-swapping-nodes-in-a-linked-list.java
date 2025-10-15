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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return head;
        ListNode current=head;
        for(int i=1;i<k;i++){
            if(current.next!=null){
                current=current.next;
            }
            else{
                return head;
            }
        }
        ListNode p=current;
        ListNode q=head;
        while(current.next!=null){
            q=q.next;
            current=current.next;
        }
        int temp=p.val;
        p.val=q.val;
        q.val=temp;
        return head;
    }
}