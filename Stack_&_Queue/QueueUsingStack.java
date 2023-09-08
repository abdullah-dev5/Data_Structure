import java.util.Stack;

//Another way to do 
// Insertion O(n).
// Removing   O(1)
public class QueueUsingStack {

    private Stack first; // Main stack. use as queue.
    private Stack second; // Helpers tack

    public QueueUsingStack() {

        first = new Stack();
        second = new Stack();

    }

    public void add(int item) throws Exception {

        while (!first.empty()) {

            second.push(first.pop());

        }

        second.push(item);
        while (!second.empty()) {

            first.push(second.pop());

        }

    }

    public int remove() { // base condition !true
        return (int) first.pop();
    }

    public boolean isEmpty() {
        return first.empty();
    }

    public int peek() throws Exception {

        return (int) first.peek();
    }

}
