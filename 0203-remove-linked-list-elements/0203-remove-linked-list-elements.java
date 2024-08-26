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
        ListNode temp = null;
        ListNode temp2 = head;

        while(temp2 != null){
            if(temp2.val == val){ 
                if(temp == null){ 
                    if(head.next == null){  
                        return null; 
                    }
                    head = head.next; 
                    temp2 = head; 
                }
                else if(temp2.next == null){ 
                    temp.next = null; 
                    break;  
                }
                else{
                    temp2 = temp2.next;
                    temp.next = temp2;
                }
            }
            else{
                temp = temp2; 
                temp2 = temp.next;
            }
            
        }
        return head;
    }
}