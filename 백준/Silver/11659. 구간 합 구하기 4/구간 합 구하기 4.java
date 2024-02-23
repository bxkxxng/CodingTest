import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int N, M;
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine());

        int[] array = new int[N];
        int[] sumArray = new int[N + 1];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum += array[i];
            sumArray[i + 1] = sum;
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int startIndex = Integer.parseInt(stringTokenizer.nextToken());
            int endIndex = Integer.parseInt(stringTokenizer.nextToken());
            int rangeSum = sumArray[endIndex] - sumArray[startIndex - 1];

            System.out.println(rangeSum);
        }
    }
}