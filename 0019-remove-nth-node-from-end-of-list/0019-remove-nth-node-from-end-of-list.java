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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        if(head.next==null && n==1)
            return null;
        int size=findSize(head);
        int pos=size-n;
        int c=1;
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode curr=d;
        for(int i=0;i<pos;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return d.next;
    }
    private static int findSize(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}