import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] Ncard = new int[N];
        for (int i = 0; i < Ncard.length; i++) {
            Ncard[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Ncard);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int count = 0;
            int card = Integer.parseInt(st.nextToken());
            count = rightCheck(Ncard, card) - leftCheck(Ncard, card);

            sb.append(count + " ");
        }
        System.out.println(sb);
    }

    static int leftCheck(int[] Ncard, int card) {
        int left = 0;
        int right = Ncard.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (Ncard[mid] >= card) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int rightCheck(int[] Ncard, int card) {
        int left = 0;
        int right = Ncard.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (Ncard[mid] > card) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}