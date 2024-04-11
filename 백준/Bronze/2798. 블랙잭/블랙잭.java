import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] card = new int[N];
        for (int i = 0; i < card.length; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card.length; j++) {
                for (int k = 0; k < card.length; k++) {
                    if (i != j && j != k && i != k) {
                        int sum = card[i] + card[j] + card[k];
                        if (sum > maxSum && sum <= M) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}