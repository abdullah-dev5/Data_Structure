import java.util.Arrays;

public class SortThePeople {

    public static void main(String[] args) {

        int[] heights = { 170, 180, 1684, 1980 };
        String[] names = { "Alice", "bob", "Alan", "Zahi" };

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    static public String[] sortPeople(String[] names, int[] heights) {

        String[] ans = new String[names.length];
        int[] sort = Arrays.copyOf(heights, heights.length);

        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j < heights.length; j++) {

                if (sort[j] > sort[j - 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;

                }

            }

        }

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length; j++) {

                if (sort[i] == heights[j]) {

                    ans[i] = names[j];
                }
            }

        }

        return ans;
    }

}
