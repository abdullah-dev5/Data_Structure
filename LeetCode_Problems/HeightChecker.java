import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };

        System.out.println(
                heightChecker(heights));
    }

    static public int heightChecker(int[] heights)

    {
        int count = 0;
        int[] sort = Arrays.copyOf(heights, heights.length);

        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j < heights.length; j++) {

                if (sort[j] < sort[j - 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(sort));

        for (int i = 0; i < sort.length; i++) {

            if (sort[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }

}
