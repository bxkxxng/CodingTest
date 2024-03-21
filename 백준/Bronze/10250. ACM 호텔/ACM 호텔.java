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

            int chueng = (N % H);
            int ho = (N / H) + 1;

            if (chueng == 0) {
                chueng = H;
                ho -= 1;
            }
            System.out.println(chueng * 100 + ho);
        }
    }
}
