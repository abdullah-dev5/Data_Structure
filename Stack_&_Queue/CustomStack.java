public class CustomStack {
    protected int [] data;
    private static final int Default_stackSize =10;
    private int ptr= -1;


    public CustomStack()
    {
        this(Default_stackSize);
    }

    public CustomStack(int size)
    {
        this.data = new int[size];
    }
    public boolean push(int items)
    {
        if(isFull())
        {
            System.out.println("Stack is Full.");
            return false;

        }
        ptr++;
        data[ptr] = items;
        return true;

    }

    public int pop() throws StackException {
        if(isEmpty())
        {
            throw new StackException("Stack is Empty.");
        }
        /*int removed = data[ptr];
        ptr--;
        return removed;
        */
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty())
        {
            throw new StackException("Stack is Empty. cannot peek");

        }
        return data[ptr];
    }
    public boolean isFull() {

    return ptr == data.length-1; //ptr is the last index.
    }

    private boolean isEmpty()
    {
        return ptr == -1;
    }


}
class Main{


    public static void main(String[] args) {


    }

}