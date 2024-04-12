import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String PS = br.readLine();
            String result = checkVPS(PS);
            System.out.println(result);
        }
    }

    static String checkVPS(String PS) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < PS.length(); i++) {
            if (Character.toString(PS.charAt(i)).equals("(")) {
                stack.push("(");
            } else {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }
        return stack.empty() ? "YES" : "NO";
    }
}