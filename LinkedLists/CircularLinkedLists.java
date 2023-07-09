public class CircularLinkedLists {
    private Node head;
    private Node tail;

    public CircularLinkedLists() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value)
    {
        Node node = new Node(value);

        if (head == null)
        {
            head=node;
            tail=node;
        return;
        }
tail.next=node;
        node.next=head;
        tail=node;

    }
    public void display()
    {
        Node node = head;
        if(head !=null)
        {
            do{
                System.out.print(node.value+" --> ");
                node=node.next;

            }
            while (node!=head);
            System.out.print(node.value+" Head");
            System.out.println();

        }

    }
    public void delete(int val)
    {
    Node node = head;
    if(node==null)
    {
        return;
    }
    if(node.value==val)
    {
        head=head.next;
        tail.next=head;
        return;
    }
    do{
       Node n= node.next;
       if(n.value==val)
       {
           node.next=n.next;
           break;
       }
       node=node.next;
    }
    while (node!=head);
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
class Main3 {
    public static void main(String[] args) {


CircularLinkedLists list = new CircularLinkedLists();

        list.insert(32);
        list.insert(36);
        list.insert(39);

        list.insert(12);
        list.delete(36);
        list.display();


    }
}
