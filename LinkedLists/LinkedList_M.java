import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList_M {

    private Node head;
    private Node tail;
    private int size = 0;

    // var is a keyword is used in java it automatically identifies the type of assgnation and convert it self into it.


    public void addlast(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            head = tail = node;

        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;

        }
        size++;
    }

    private boolean isEmpty()// method is used to check head is empty or not !.
    {
        return head == null;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        var temp = head.next;
        head.next = null;
        head = temp;

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail) {
            head = tail = null;
        } else {
            var previous = getPrevious(tail);

            previous.next = null;
            tail = previous;//alternate
            //  tail=previous;
            //tail.next=null;

        }
        size--;
    }

    private Node getPrevious(Node node) {
        var temp = head;
        while (temp != null) {
            if (temp.next == node)
                return temp;


            temp = temp.next;
        }
        return null;


    }

    public int indexOf(int val) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == val)
                return index;

            current = current.next;
            index++;
        }
        return -1;
    }


    public boolean contains(int value) {
        if (indexOf(value) != -1)
            return true;

        return false;
    }
public  int [] ArrayTo()
{
    int [] array = new int[size];
    Node temp= head;
   int index=0;
    while (temp!=null)
    {
        array[index++]= temp.value;
        temp= temp.next;

    }
    return array;
   }

    public int size() {
        return size;

    }

    public void reverse()
    {
        if(isEmpty())
            return;
        var previous = head;
        var current =head.next;
        while(current != null)
        {
            var temp = current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }

        tail=head;
        tail.next = null;
        head=previous;

    }





    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}

class MainList {
    public static void main(String[] args) {
        LinkedList_M list = new LinkedList_M();
        list.addFirst(10);
        list.addlast(12);
        list.addlast(15);
        list.addlast(45);
        list.addFirst(32);
        list.addlast(11);


        var array= list.ArrayTo();

        System.out.println(Arrays.toString(array));
        list.reverse();
        var arrays= list.ArrayTo();

        System.out.println(Arrays.toString(arrays));

    }
}