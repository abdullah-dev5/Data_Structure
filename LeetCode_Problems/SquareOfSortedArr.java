import java.util.Arrays;

public class SquareOfSortedArr {
 
    public static void main(String[] args) {
        int []  arr = {
            -1,-4,2,0,3,5,6
        };
       
        System.out.println(Arrays.toString( sortedSquares(arr)));
    }
    


    static public int [] sortedSquares(int [] nums)
    {
        int [] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            
            ans[i] = (nums[i]*nums[i]);
        }

        System.out.println(Arrays.toString(ans));

        return     sort(ans)
;
    }











    static int [] sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break;
                }
            }
        }
        return arr;
    }

    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
