import java.util.Arrays;

public class SortSentance {

    public static void main(String[] args) {
        String s = "is2 Not1 yet4 completed3";

        String s1 = "is2 sentence4 This1 a3";
        System.out.println(sortSentance(s1));

    }

    static public String sortSentance(String s) {

        int k = 0;
        int i = 0;
        int beginIndex = 0;
        int check = 1 + noOfSpace(s);
        String[] str = new String[check];

        while (k < check) {
            if (s.charAt(i) <= 57 && s.charAt(i) > 48) {
                int index = (s.charAt(i) - 48);
                System.out.println(" index no " + index);
                System.out.println(s.substring(beginIndex, i));
                str[(index - 1)] = s.substring(beginIndex, i);
                beginIndex = i + 2;
                k++;

            }

            i++;
        }

        return arrayIntoString(str);
    }

    public static int noOfSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 32) {
                count++;
            }
        }
        return count;
    }

    public static String arrayIntoString(String[] str) {
        String ans = "";
        for (int i = 0; i < str.length; i++) {

            ans += str[i] + " ";
        }
        return ans;
    }

}