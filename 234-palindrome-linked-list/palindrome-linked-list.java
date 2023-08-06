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
    public boolean pal(String s){
        for (int i=0; i<s.length()/2; i++){
            
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr = new ListNode();
        curr = head;
        StringBuilder sb = new StringBuilder();

        while (curr != null) {
            sb.append(String.valueOf(curr.val));
            curr = curr.next ;
        }
        
        return pal(sb.toString());
    }
}