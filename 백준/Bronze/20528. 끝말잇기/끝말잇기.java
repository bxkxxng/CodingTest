import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        st = new StringTokenizer(br.readLine());
        char firstAlpabet = st.nextToken().charAt(0);

        for (int i = 0; i < N - 1; i++) {
            String S = st.nextToken();
            char lastAlpabet;
            lastAlpabet = S.charAt(S.length() - 1);

            if (firstAlpabet == lastAlpabet) {
                count++;
            } else {
                break;
            }
            firstAlpabet = S.charAt(0);
        }

        System.out.println(count == N - 1 ? 1 : 0);
    }
}