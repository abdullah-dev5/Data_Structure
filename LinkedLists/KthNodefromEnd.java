import LL.Node;

public  class KthNodefromEnd{






   int getLastNode(Node head, int n)
    {
        Node slow = head;
        Node fast =  head;
            int start = 0;

            while (fast.next!=  null ) {

                fast = fast.next;
                start++;


                if(start > n)
                {
                    slow = slow.next;
                }

            }


            return slow.data;
    }



}