public class InterpolationSearch{



    public static void main(String[] args) {
        


        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

        int key = 15;

        int low = 0 ;
        int high = arr.length-1;
        System.out.println(interpolationSearch(arr, low, high, key));



    }

    static int interpolationSearch(int [] arr, int low , int high , int x)
    {

        int   pos;
        
        
        if(low <= high && x >= arr[low] && x <= arr[high])
        {


            pos = low
            + (((high - low) / (arr[high] - arr[low]))
               * (x - arr[low]));


                if(arr[pos]==x)
                return pos;

                if(arr[pos]<x)
                return interpolationSearch(arr, pos+1, high, x);

             if(arr[pos]>x)
                return interpolationSearch(arr, low, pos-1, x);


        }






        return -1 ;
    }


}