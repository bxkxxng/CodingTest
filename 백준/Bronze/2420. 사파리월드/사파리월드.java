import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        long N = Integer.parseInt(stringTokenizer.nextToken());
        long M = Integer.parseInt(stringTokenizer.nextToken());

//        if (N < 0) N = N * (-1L);
//        if (N < 0) N = Math.abs(N);

        System.out.println(Math.abs(N - M));
    }
}