import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<String> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front" -> deque.addFirst(st.nextToken());
                case "push_back" -> deque.addLast(st.nextToken());
                case "pop_front" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                        deque.pollFirst();
                    }
                }
                case "pop_back" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                        deque.pollLast();
                    }
                }
                case "size" -> System.out.println(deque.size());
                case "empty" -> System.out.println(deque.isEmpty() ? 1 : 0);
                case "front" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                }
                case "back" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + br.readLine());
            }
        }
    }
}