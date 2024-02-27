import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        IntStream.range(1, N + 1).forEach(i -> {
            IntStream.range(1, i + 1).forEach(j -> System.out.print("*"));
            System.out.println();
        });
    }
}