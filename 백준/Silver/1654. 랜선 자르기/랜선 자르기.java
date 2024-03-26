import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static long searchSize(long arr[], int N, long max) {
        long mid = 0;
        long min = 1;

        while (min <= max) {
            mid = (min + max) / 2;
            long count = 0;

            for (long num : arr) {
                count += num / mid;
            }

            if (count < N) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return (max + min) / 2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long result = 0;
        long max = 0;

        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        result = searchSize(arr, N, max);

        System.out.println(result);
    }
}
