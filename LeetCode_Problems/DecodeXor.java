import java.util.Arrays;

public class DecodeXor {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9 };

        int[] results = decode(arr, 4);
        System.out.println(Arrays.toString(results));
    }

    static public int[] decode(int[] encoded, int first) {

        int[] ans = new int[encoded.length + 1];

        ans[0] = first;
        for (int i = 0; i < encoded.length + 1 - 1; i++) {
            ans[i + 1] = encoded[i] ^ ans[i];
        }
        return ans;
    }
}
