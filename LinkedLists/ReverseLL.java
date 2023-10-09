import LL.Node;

public class ReverseLL {

    Node reverseList(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next; // Save next Node.
            current.next = prev; // reverse Node

            prev = current; // update or advance Previous Node.
            current = next; // update or advance Curent Node.

        }

        return prev;
    }

}
