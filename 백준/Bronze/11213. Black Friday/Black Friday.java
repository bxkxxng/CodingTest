import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //For example, if there are three players and the outcomes are 6, 6 and 5, then the third player wins,
        // because the first and second player lose even though their outcomes are higher,
        // since they both have the same outcome.
        // If instead the third player also rolls 6,
        // then nobody wins. They asked you to write a program for selecting the winner.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] rolls = new int[n];
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            rolls[i] = Integer.parseInt(st.nextToken());
            counts.put(rolls[i], counts.getOrDefault(rolls[i], 0) + 1);
        }

        int winner = -1;
        int highestUnique = 0;

        for (int i = 0; i < n; i++) {
            if (counts.get(rolls[i]) == 1 && rolls[i] > highestUnique) {
                highestUnique = rolls[i];
                winner = i;
            }
        }

        if (winner != -1) {
            System.out.println(winner + 1); // 인덱스는 0부터 시작하므로 1을 더함
        } else {
            System.out.println("none");
        }
    }
}