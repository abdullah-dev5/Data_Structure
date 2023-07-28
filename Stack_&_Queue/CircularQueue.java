public class CircularQueue{




    protected int [] data;
    private static final int Default_QueueSize =10;
   protected int end =0;
    protected int front=0;
    private int size = 0;

    public CircularQueue() {
        this(Default_QueueSize);
    }
    public  CircularQueue(int size) {

        this.data = new int[size];

    }
    public boolean isFull() {

        return size == data.length; //ptr is the last index.
    }

    private boolean isEmpty()
    {
        return size == 0;
    }
    public  boolean insert(int item)
    {
        if(isFull())
            return false;

        data[end++] = item;
        end= end % data.length;

        size++;
        return true;
    }



    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty.");
        }
        int removed =data[front];
        front=front % data.length;
        size--;

        return removed;
    }
    public int front () throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty.");
        }
        return data[front];
    }
    public void display()
    {
        int i = front;
        do{
            System.out.println(data[i]+" --> ");
            i++;
            i= i% data.length;

        }
        while (i!=end);
System.out.println("END");


    }






}
