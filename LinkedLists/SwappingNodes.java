

public class SwappingNodes {

    void swapping( Node head ,int a, int b) {
        if (a == b) {
            return;
        }

        Node cur = head;
        Node prev = null;
        Node prevA = null;
        Node prevB = null;
        Node nodeA = null;
        Node nodeB = null;

        while (cur != null) {

            if (cur.data == a) {
                nodeA = cur;
                prevA = prev;
            }

            if (cur.data == b) {
                nodeB = cur;
                prevB = prev;
            }

            prev = cur;
            cur = cur.next;

        }

        if (nodeA == null || nodeB == null) {
            return;

        }

        if (!prevA == null) {

            prevA.next = nodeB;
        }

        else {
            head = nodeB;
        }
        if (!prevB == null) {

            prevB.next = nodeA;
        }

        else {
            head = nodeA;

        }

        Node temp = nodeA.next;
        nodeA.next = nodeB.next;
        nodeB.next = temp;
    }

}
