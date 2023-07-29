public class CustomQueue {
    private int [] data;
    private static final int Default_QueueSize =10;
    private int end =0;

    public CustomQueue() {
        this(Default_QueueSize);
    }
    public  CustomQueue(int size) {

    this.data = new int[size];

    }
    public boolean isFull() {

        return end == data.length; //ptr is the last index.
    }

    private boolean isEmpty()
    {
        return end == 0;
    }
    public  boolean insert(int item)
    {
        if(isFull())
            return false;

        data[end++] = item;

    return true;

    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty.");
        }
        int removed =data[0];
        //shifts the elements to left.
        for(int i = 1; i < end; i++)
        {
            data[i-1]=data[i];

        }
        end--;

    return removed;
    }
    public int front () throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty.");
        }
        return data[0];
    }

    public void display()
    {
        for(int i = 0; i < end;i++)
        {
            System.out.print(data[i]+",");
        }
        //System.out.print("End");
         System.out.println("End");
    }




}
