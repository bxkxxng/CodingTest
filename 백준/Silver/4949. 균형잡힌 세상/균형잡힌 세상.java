import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String sentence = br.readLine();
            if (sentence.equals(".")) {
                break;
            }
            if (isBalanced(sentence)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean isBalanced(String word) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            String bracket = String.valueOf(word.charAt(i));
            switch (bracket) {
                case "(":
                case "[":
                    stack.push(bracket);
                    break;
                case ")":
                    if (stack.empty() || !stack.peek().equals("(")) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case "]":
                    if (stack.empty() || !stack.peek().equals("[")) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.empty();
    }
}