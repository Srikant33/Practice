class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode a=head;
        ListNode half=head;
        while (head.next!=null){
            if(head.next.next!=null){
                head=head.next.next;
                half=half.next;
            }
            else{ 
                head=head.next;
                half=half.next;
            }
        }
        // System.out.println(count+1);
        // for (int i=0;i<(count+1)/2; i++){
        //     a=a.next;
        // }
        return half;
    }
}