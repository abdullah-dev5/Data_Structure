
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

public static void main(String[] args) {
    
    
    int [] arr = {21,16,40,71,97,32,95,14,58};
      //for reverse array ..
    Integer [] array = {21,16,40,71,97,32,95,14,58,45};

    int search = 32;    
    int results = binary_Search(arr,search);    

    search = 45;
    int result1 = reverse_BinarySearch(array,search);
   
    System.out.println(" at index : "+results);
    System.out.println("  Reverse at index : "+result1);

}

 static  int binary_Search(int[] arr, int target)
 {

    int left = 0;
    int right = arr.length;

// first sorted array 
    
    Arrays.sort(arr);
    //array is sorting in ascending
   
    while(left <= right)
    {

            int mid = (left+right)/2 ;

            if(target==arr[mid])
            
              {  return mid;
              
            }

         if(target<arr[mid])
            right = mid-1;

            else{
                left = mid+1;
            }

    }

return -1;
 }


    // Reversing Array then Binary Search
 static   int reverse_BinarySearch(Integer []arr, int target)
    {
        
        // we have to create Integer array instead of Int.
        //Collections.reverseOrder() method help us to sort in descending.
        Arrays.sort(arr, Collections.reverseOrder());
            
  int left = 0;
    int right = arr.length;

// first sorted array 
    
    Arrays.sort(arr);
    //array is sorting in ascending
   
    while(left <= right)
    {

            int mid =left+(right-left)/2 ;

            if(target==arr[mid])
            
              { 
                 return mid;
              
            }

         if(target>arr[mid])
            right = mid+1;

            else{
                left = mid-1;
            }

    }

        return -1;
    }




}
