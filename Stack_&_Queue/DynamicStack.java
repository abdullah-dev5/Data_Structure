public class DynamicStack  extends CustomStack{


    public DynamicStack()
    {
        super();//it will pass custom stack.
    }
    public DynamicStack(int size)
    {
    super(size);
    }

    @Override
    public boolean push(int items) {
        //this  takes care  of its  being
        if(isFull())
        {
            //double the array size
            int [] temp = new int[data.length*2];

            //copy all the previous items in new  data
            for(int i=0; i<data.length; i++)
            {
                temp[i] = data[i];

            }
            data = temp;
        }
        return super.push(items);
    }
}
