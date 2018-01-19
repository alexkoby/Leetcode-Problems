/**Prompt:
 * l1 and l2 are singly-linked lists, however, their digits are backwards. 
 * The Goal of this exercise is to add the two lists, with their digits not backwards, together
 * 
 * Example: [3,5,7], [7,6,3] --> 753 + 367 --> 1120
 * 
 * Completed 1/18/18
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long spot1 = 0;
        long spot2 = 0;
        int sum = 0;
        
        sum = l1.val + l2.val; 
        ListNode head = new ListNode(sum%10); //first digit in goal list
        sum /= 10;
        l1=l1.next;
        l2=l2.next;
        
        ListNode tracer = head;
        
        //find the sum of each of the following nodes pairs 
            //and add to list, if sum will be greater than 10, carry over 1
        while (l1 != null || l2 != null || sum > 0){ 
            if(l1 != null){
                spot1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                spot2 = l2.val;
                l2 = l2.next;
            }
            sum += spot1 + spot2;
            ListNode tmp = new ListNode(sum%10);
            sum /= 10;
            
            tracer.next = tmp;
            tracer = tmp;
            
            spot1=spot2=0; //if statement might not hit - dont want old spot1, spot2 vlaues
        }
        return head;        }
    }
