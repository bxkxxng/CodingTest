import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        int factorial = 1;
        for (int i = N; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}