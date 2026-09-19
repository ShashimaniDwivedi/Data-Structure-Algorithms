import java.util.Stack;

public class ValidParenthesis {

    public static boolean validParenthesis(char[] arr) {

        Stack<Character> s = new Stack<>();

        for (char i : arr) {

            // Opening brackets
            if (i == '(' || i == '{' || i == '[') {
                s.push(i);
            }

            // Closing brackets
            else {
                if (s.empty()) {
                    return false;
                }

                char top = s.pop();

                if (top == '(' && i != ')') {
                    return false;
                }

                if (top == '{' && i != '}') {
                    return false;
                }

                if (top == '[' && i != ']') {
                    return false;
                }
            }
        }

        return s.empty();
    }

    public static void main(String[] args) {

        String parenthesis = "({[]})";

        char[] arr = parenthesis.toCharArray();

        boolean res = validParenthesis(arr);

        if (res) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}


