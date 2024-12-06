import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //재료
        int M = Integer.parseInt(br.readLine()); //합

        int[] suit = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            suit[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(suit);
        // 1 2 3 4 5 7
        int count = 0;
        int start = 0;
        int end = N - 1;
        
        while (start < end) {
            int sum = suit[start] + suit[end];
            if (sum == M) {
                count++;
                start++;
                end--;
            } else if (sum < M) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}