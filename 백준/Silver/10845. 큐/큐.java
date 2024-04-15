import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" -> queue.offer(st.nextToken());
                case "pop" -> {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                        queue.poll();
                    }
                }
                case "size" -> System.out.println(queue.size());
                case "empty" -> System.out.println(queue.isEmpty() ? 1 : 0);
                case "front" -> {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                }
                case "back" -> {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(((LinkedList<String>) queue).peekLast());
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + br.readLine());
            }
        }
    }
}