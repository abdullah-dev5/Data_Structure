public class LinkedLists {

    private Node head;
    private Node tail;
    private int size;

    public LinkedLists() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head; //the added  node will be placed head.
        head = node;  // head points to the first node.

        if (tail == null)//if head and tails are the same element.
        {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if (tail == null)  //Only value
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index)// insert at particulor index.
    {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();

        }
        if (index == size - 1) {
            return deleteLast();

        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        size--;

        return val;
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

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;  // temp node will point every next node.
        while (temp != null) {

            System.out.print(temp.value + "--> ");

            temp = temp.next;
        }
        System.out.print("End");
    }

    //inner Class Node
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

class Main {
    public static void main(String[] args) {


        LinkedLists list = new LinkedLists();


        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertLast(78);
        list.insert(67, 3);
        list.display();
        System.out.println("\n" + list.deleteFirst());
        list.display();
        System.out.println("\n" + list.deleteLast());
        list.display();
    }
}