import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> card = new LinkedList<>();
        for (int i = 1; i < N + 1; i++) {
            card.offer(i);
        }

        int temp = 1;
        while (card.size() != 1) {
            card.poll();
            temp = card.poll();
            card.offer(temp);
        }
        System.out.println(temp);
    }
}