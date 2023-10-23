import java.util.Stack;

public class RemoveStar {

    public static void main(String[] args) {

        System.out.println(removeStars("leet***code"));
        System.out.println(removeStars("erase*****"));

    }

    static public String removeStars(String s) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char flag = s.charAt(i);

            if (flag != '*') {

                stack1.push(flag);
            }
            if (flag == '*') {
                stack1.pop();
            }
        }
        while (!stack1.isEmpty()) {

            char c = stack1.pop();
            stack2.push(c);
        }
        while (!stack2.isEmpty()) {

            ans += stack2.pop();
        }

        return ans;
    }
}