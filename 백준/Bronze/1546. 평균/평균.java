import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(reader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        double sum = 0;
        int[] scores = new int[subject];
        for (int i = 0; i < subject; i++) {
            scores[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int highScore = Arrays.stream(scores).max().getAsInt();

        for (int i = 0; i < subject; i++) {
            sum += ((double) scores[i] / highScore) * 100;
        }
        System.out.println(sum / subject);
    }
}