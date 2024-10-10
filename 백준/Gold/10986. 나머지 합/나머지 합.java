import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 숫자 갯수
        int M = Integer.parseInt(st.nextToken()); // 나누는 수

        long[] S = new long[N]; // 합 배열
        long[] count = new long[M]; // M으로 나눈 나머지 배열

        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            long remainder = sum % M;

            // 음수 나머지 처리
            if (remainder < 0) {
                remainder += M;
            }
            count[(int) remainder]++;
        }

        // 나머지가 0인 경우를 포함하여 부분 수열 개수 세기
        long cnt = count[0];
        for (int i = 0; i < M; i++) {
            if (count[i] > 1) {
                cnt += count[i] * (count[i] - 1) / 2;
            }
        }

        System.out.println(cnt);
    }
}