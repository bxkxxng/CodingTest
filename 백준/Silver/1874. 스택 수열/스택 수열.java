import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            int N = Integer.parseInt(br.readLine());
            for (; tmp <= N; tmp++) {
                stack.push(tmp);
                sb.append("+\n");
            }
            if (stack.peek() == N) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}