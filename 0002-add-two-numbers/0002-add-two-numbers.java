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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        ListNode tempp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int summ=0;
            if(l1!=null){
                summ=summ+l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                summ=summ+l2.val;
                l2=l2.next;
            }
            summ+=carry;
            ListNode newNode= new ListNode(summ%10);
            carry=summ/10;
            tempp.next=newNode;
            tempp=tempp.next;
        }
        return dummy.next;
    }
}