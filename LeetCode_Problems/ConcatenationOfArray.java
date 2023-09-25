import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {

        int[] arr = {
                1, 2, 3, 4
        };

        int[] answer = getConcatenation(arr);

        System.out.println(Arrays.toString(answer));

    }

    static public int[] getConcatenation(int[] nums) {

        int length = (nums.length) * 2;
        System.out.println(length);
        int[] ans = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                ans[i] = nums[i];
                System.out.println(ans[i]);
            }

            if (i >= length / 2) {

                ans[i] = nums[count];
                System.out.println(ans[i]);
                count++;
            }

        }
        return ans;
    }
}