import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //15 = 7+8 , 4+5+6, 1+2+3+4+5, 15 연속된 자연수의 합
        int[] arrN = new int[N];
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1; // N 포함

        while (start <= N / 2) {
            if (sum == N) {
                count++;
                sum -= start;
                start++;
            } else if (sum < N) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}