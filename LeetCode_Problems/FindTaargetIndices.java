
// 2089. Find Target Indices After Sorting Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTaargetIndices {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 2, 3 };

        List<Integer> list = targetIndices(arr, 2);
        System.out.println(list.toString());

    }

    static public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> foundedList = new ArrayList<Integer>();

        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                foundedList.add(i);
            }
            if (nums[i] > target) {
                break;
            }

        }
        return foundedList;
    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

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
