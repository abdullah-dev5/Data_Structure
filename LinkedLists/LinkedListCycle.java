public class LinkedListCycle {


    private class Node{

        private int data;
        private Node next;

        public Node (int val)
        {
            this.data = val;
            this.next = null;
        }

    }



    //fast is twice the slow .
    // slow iterate one by one while fast twice .
    //if it has cycle it meets somepoints or node.
    public boolean hasCycle(Node head)
    {

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow)
            {
                return true;
            }
        }



        return false;

    }
    //Length Of Cycle
    public int lengthOfCycle(Node head)
    {
        int count =0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
          
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow)
            {
                Node temp = slow;
               do
                {
                    count++;

                    temp = temp.next;


                } 
                 while(temp != slow);
                 return count;       
            }
        }

        return 0;
    }
    //Detect Cycle starting at Nth node.
        public Node detectCycle(Node head)
        {
            int length =0;

 Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow)
            {
                length =  lengthOfCycle(slow);
                break ;
            }

        }
        if (length ==0) {
            return null;
            
        }
        // find the start
        Node first = head ;
        Node second = head;
        while (length >0)
        {
            second=second.next;
            length--; 
        }
        //keep moving both forward and they will meets at start of Cycle.
        while (first!=second) {

            first = first.next;
            second = second.next;
        }

        return second;





        } 


}

