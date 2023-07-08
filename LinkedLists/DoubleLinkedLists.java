public class DoubleLinkedLists {
private Node head;
private Node tail;
private int size;

public void insertFirst(int val)
{
    Node node = new Node(val);
    node.next= head;
    node.prev= null;
    if(head !=null)//if head is already null then it gives error so to avoid it if statement used.
    {
        head.prev= node;

    }
    head= node;

}
public void insertLast(int val)
{
    Node node = new Node(val);
    Node last = head;
    node.next= null;
    if(head ==null){
        node.prev=null;
        head=node;
    return;

    }
    while (last.next != null)
    {
    last=last.next;
    }
    last.next=node;
    last.prev=last;

}
    public void insert(int after, int val)// insert at particulor index.
    {
    Node p= find(after);
    if(p==null){
        System.out.println("Does not exist");
        return;
     }
    Node node = new Node(val);
        node.next=p.next;
         p.next=node;
         node.prev=p;
         if (node.next!=null) {
             node.next.prev = node;
         }
    }

public void display()
{
    Node node =head;
    Node temp = node;
    while(temp != null)
    {
        System.out.print(temp.value+" --> ");
        temp = temp.next;
    }
    System.out.print("End");
    System.out.println();
}


    public void displayReverse()
    {
        Node node =head;
        Node temp = node;
        Node last=null;
        while(temp != null)
        {
            last = temp;
            temp = temp.next;

        }
        while(last != null)
        {
            System.out.print(last.value+" --> ");
            last = last.prev;
        }
        System.out.print("Start");
        System.out.println();

    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
private class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

}
class Main2 {
    public static void main(String[] args) {


        DoubleLinkedLists list = new DoubleLinkedLists();


        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(1);
        list.display();

        list.insertLast(45);
        list.display();

        System.out.println("Reverse");
        list.displayReverse();
        list.insert(4,33);//here we will pass the value instead of index no it will put next to that value.
        list.display();



    }
}