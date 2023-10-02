
// pivot : choose any random elemnet .  after first pass.
// all the elements <  P . will be on the left side.
// all the elements > P . will be on the right side .

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {
                1, 5, 6, 2, 8, 6, 9, 4, 10, 0
        };
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        // pivot is afixed point
        int pivot = nums[mid];

        while (start <= end) {

            while (nums[start] < pivot) {
                start++;

            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        }

        sort(nums, low, end);
        sort(nums, start, high);

    }

}
