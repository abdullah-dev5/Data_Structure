  import java.util.Arrays;
public class RichestCustomerWealth {

  
 public static void main(String[] args) {
    int [] []accounts = {{1,5,8,},{5,9,7},{4,6,10}};


   System.out.println( maximumWealth(accounts));

 }
 
    static   public int maximumWealth(int[][] accounts) {
     
        int [] arr =  new int [accounts.length];
           int sum =0;
           for(int i =0 ; i< accounts.length ; i++)
           {
               for(int j = 0 ; j< accounts[i].length ; j++)
               {
                   sum += accounts[i][j];
   
               }
               arr[i]= sum;
               sum=0;
           }
           insertionSort(arr);
           System.out.println(Arrays.toString(arr));
          
           return arr[arr.length-1];   
       }
    
       static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break;
                }
            }
        }

    }

    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
