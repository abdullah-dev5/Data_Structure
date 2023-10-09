class Solution {
    public ListNode reverseList(ListNode head) {
     
        if(head == null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode present =  head;
        ListNode another =  present.next;

        while(present != null)
        {
            present.next =  prev;
            prev = present ;
            present = another;
            if(another != null)
            {
                another= another.next;
            }

        }
        
        return prev;
    }
}
