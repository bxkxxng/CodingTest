import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String alphabet = st.nextToken();

        long hasing = 0;
        for (int i = 0; i < L; i++) {
            int alphabetToInt = alphabet.charAt(i) - 96;
            hasing += (long) (alphabetToInt * Math.pow(31, i));
        }
        System.out.println(hasing);
    }
}