import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (S < 1024) {
            System.out.println("No thanks");
        } else {
            int needMoney = S - 1023;
            int borrowMoney = M;
            if ((needMoney & borrowMoney) == needMoney) {
                System.out.println("Thanks");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}