import java.util.Stack;

public class ValidateStackSequence {

    public static void main(String[] args) {

        int[] pushed = { 5, 10, 15, 20, 25 };
        int[] popped = { 25, 20, 15, 10, 5 };
        System.out.println(validate(pushed, popped));

    }

    static boolean validate(int[] pushed, int[] popped) {

        Stack<Integer> s = new Stack<>();
        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            s.push(pushed[i]);

            while (!s.empty() && (s.peek() == popped[j])) {

                s.pop();
                j = j + 1;
            }

        }

        if (s.empty()) {
            return true;
        }

        return false;
    }

}
