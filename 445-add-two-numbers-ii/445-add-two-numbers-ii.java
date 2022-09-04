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
    
    public ListNode reverse(ListNode l){
        ListNode prev=null;
        ListNode next=null;
        while (l!=null){
            // System.out.print(l.val);
            next = l.next;
            l.next=prev;
            prev = l;
            l=next;
        }
        
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = reverse(l1);
        ListNode l4 = reverse(l2);
        // System.out.println(l3.next.val);
        // System.out.println(l4.val);
        
        ListNode r = new ListNode(); 
        ListNode r2 = r;
        int rem=0;
        while (l3 != null && l4!=null ){
            r.next = new ListNode();
            r = r.next;
            r.val = (l3.val +l4.val+rem)%10;
            rem = (l3.val+l4.val+rem)/10;
            l3=l3.next;
            l4= l4.next;
            
            if ((l3 ==null || l4 ==null ) && (l3 !=null || l4 !=null)){
                if (l3 ==null){
                    l3= new ListNode(0);
                }
                else {
                    l4 = new ListNode(0);
                }
            }
        }
        if (rem!=0){
            // System.out.println("aaa");
            r.next= new ListNode(rem);
            r=r.next;
        }
        // System.out.println(r2.next.val);
         return reverse(r2.next);
    }
}