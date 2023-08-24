
public class TernarySearch {



    public static void main(String[] args) {
    
        
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

        int key = 15;

        int left = 0 ;
        int right = arr.length;
         System.out.println(ternarySearch(left, right, key, arr));





    }


   static int  ternarySearch(int left ,  int right , int key , int [] arr)

   {
    if(right>=1) {
        
        int mid1 = left + (right - left )/3;    
        System.out.println(" mid1 :"+mid1);
        int mid2 = right - (right - left )/3;    
 System.out.println(" mid2 :"+mid2);

        if(arr[mid1]==key)
        return mid1;

        else if(arr[mid2]==key)
        return mid2;

        else if(arr[mid1]>key)
        return ternarySearch(mid1+1, right, key, arr);

        else if(arr[mid2]<key)
        return ternarySearch(left, mid2-1, key, arr);

        else {
            return ternarySearch(mid1+1, mid2-1, key, arr);

        }


    }



    return -1;
   }



    
}
