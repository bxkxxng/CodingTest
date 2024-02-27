import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }
    }
}