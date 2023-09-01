public class ReverseNumber {

    static int sum = 0;

    public static void main(String[] args) {

        int num = 45678;

    }

    // method 1
    // using external var sum
    public static void reverseTheNum(int n) {

        if (n == 0)
            return;

        int rem = n % 10;

        sum = sum * 10 + rem;

        reverseTheNum(n / 10);

    }

    static int reverseNumber2(int n) {
        int digits = (int) (Math.log(n)) + 1;

        return helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }

}
