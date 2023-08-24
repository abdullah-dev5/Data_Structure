public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8, 9 };

        int key = 8;
        int strt = 0;
        int end = arr.length - 1;

        System.out.println(recursiveBS(arr, key, strt, end));

    }

    static int recursiveBS(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (arr[mid] > target) {
            return recursiveBS(arr, target, start, mid - 1);
        }

        return recursiveBS(arr, target, mid + 1, end);
    }

}
