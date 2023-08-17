public class linearSearch{

    // worst time conmplexity is O(n). when a element does not found or at the last index.
    // Best time complexity is O(1). when element found at 0th index.
    
    public static void main(String[] args) {

        System.out.println("Hello Wolrd");

        int [] array = {23,45,32,21,35,48,5};

        int search  = 328 ;

        System.out.println(linear_Search(array, search));


         search  = 5 ;

        System.out.println(linear_Search(array, search));

        
         search  = 21 ;

        System.out.println(linear_Search(array, search));

    }

    // Search element at what index number it lies.
    static int linear_Search(int [] arr, int target )
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int i = 0 ; i <arr.length ; i++ )
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
  return -1;
    }


    // when you want to return element instead of index.
static int linear_Search2(int [] arr, int target )
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int element :arr )
        {
            if( element == target)
            return element;
        }
  return -1;
    }
  
 
        // when you want ansswer in Boolean . true or False
static boolean linear_Search3(int [] arr, int target )
    {
        if(arr.length==0)
        {
            return false;
        }

        for(int i = 0 ; i <arr.length ; i++ )
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
  return false;
    }
}