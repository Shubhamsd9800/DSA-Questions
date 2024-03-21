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
    public ListNode reverseList(ListNode head) {
        // ListNode prev=null;
        // ListNode curr=head;
        // ListNode next;
        // while(curr!=null){
        //   next=curr.next;
        //   curr.next=prev;
        //   prev=curr;
        //   curr=next;
        // }
        // head=prev;
        // return prev;
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newNode;
    }
}