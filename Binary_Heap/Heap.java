public class Heap
{
    int size ;
    int [] arr ;
    int capacity ;
    public Heap(int size)
    {
        arr = new int[size];
        arr[0] = -1;
        size = 0;
        capacity = size;
    }

         void insert (int value)
        {
            size = size + 1;
            int index =  size ;

            arr[index] = value;

            while (index>1) {
                
                int parent = index/2;

                    if (arr[parent] < arr[index]) {
                        
                        swap(arr, arr[parent],arr[index]);
                        index = parent;
                    }
                    else{
                        return;
                    }
            }



        }

        private void swap(int[] array, int firstIndex, int secondIndex) {
            int temp = arr[firstIndex];
            arr[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
        }
            void print()
            {
                for (int i = 1; i < arr.length; i++) {
                    System.out.print( arr[i]+" ");                   
                }
                System.out.println();
            }



}

class Main{

        public static void main(String[] args) {
         
            Heap h = new Heap(100);
            h.insert(50);
            h.insert(55);
            h.insert(53);
            h.insert(52);
            h.insert(54);
            h.print();
        }
}