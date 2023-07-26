import java.util.*;

public class Built_In{



    public static void main(String[] args) {
  //built in stacks
        //stacks are Claesses
        //L-i-F-O
 /*       Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(25);
        stack.push(28);
        stack.push(31);
        stack.push(34);
        stack.push(37);
        System.out.println(stack.pop());//37
        System.out.println(stack.pop());//34
        System.out.println(stack.pop());//31
        System.out.println(stack.pop());//28
        System.out.println(stack.pop());//25
        System.out.println(stack.pop());//22


*/
        //  Built in Queue
        // Queues are basically Inerfaces
        //F-I-F-O
/*

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(8);
        queue.add(2);
        queue.add(4);
        System.out.println(queue.peek());//head one print but not remove
        System.out.println(queue.remove());//remove
*/


        //DeQue.
        //Deque is basically functions or works from both side.like addfirst and removefirst .
        // also addLast & removelast.
        // it's also a interface which extends the queue interface.
        Deque<Integer> deque= new ArrayDeque<>();
        deque.add(23);
        deque.addFirst(34);
        deque.addLast(54);
        deque.removeFirst();





    }
}