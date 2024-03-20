import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //층
            int H = Integer.parseInt(st.nextToken());
            //호
            int W = Integer.parseInt(st.nextToken());
            //몇번째 손님
            int N = Integer.parseInt(st.nextToken());

            int chueng = (N / H) + 1;
            int ho = (N % H);

            if (ho == 0) {
                ho = H;
                chueng -= 1;
            }
            System.out.println(ho * 100 + chueng);
        }
    }
}