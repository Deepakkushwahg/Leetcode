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
    int lengthOfList(ListNode head){
        int c=0;
        if(head == null)
            return 0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = lengthOfList(head);
        if(n==1 && head.next == null)
            head = null;
        else if(len==n)
        {
            head = head.next;
        }
        else if(n==1){
            ListNode temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        else
        {
            ListNode temp = head;
            int c=1;
            while(temp!= null){
                if(c == len-n){
                    break;
                }
                c++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}