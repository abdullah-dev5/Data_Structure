import java.util.Stack;

// Insertion O(1).
// Removing   O(n).
public class QueueUsingStacks {

    private Stack first; // Main stack. use as queue.
    private Stack second; // Helpers tack

    public QueueUsingStacks() {

        first = new Stack();
        second = new Stack();

    }

    public void add(int item) {
        first.push(item);

    }

    public int remove() throws Exception { // base condition !true
        while (!first.empty()) {

            second.push(first.pop());

        }

        int removed = (int) second.pop();
        while (!second.empty()) {

            first.push(second.pop());

        }

        return removed;
    }

    public boolean isEmpty() {
        return first.empty();
    }

    public int peek() throws Exception {
        while (!first.empty()) {

            second.push(first.pop());

        }

        int peeked = (int) second.peek();
        while (!second.empty()) {

            first.push(second.pop());

        }

        return peeked;

    }

}