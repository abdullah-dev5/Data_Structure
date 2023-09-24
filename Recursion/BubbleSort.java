import java.util.Arrays;

public class BubbleSort {
 
    
public static void main(String[] args) {
    int [] arr = {
            1,4,6,3,2,7,9,8,10,15,11,3
    };

    bubbleSort(arr, arr.length-1, 0);
    System.out.println(Arrays.toString(arr));
}



    static void bubbleSort(int [] arr,int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
         
            if(arr[col] > arr[col+1])
            {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1]= temp;
            }


            bubbleSort(arr,row, col+1);
           

 
        } else {
            System.out.println();
            bubbleSort(arr,row-1, 0);
            

        }

    }


}
