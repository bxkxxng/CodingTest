import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        String[] word = new String[(int) N];

        for (int i = 0; i < N; i++) {
            word[i] = br.readLine();
        }
        Arrays.stream(word)
                .distinct()
                .sorted(Comparator.comparingLong(String::length).thenComparing(String::compareTo))
                .forEach(System.out::println);
    }
}