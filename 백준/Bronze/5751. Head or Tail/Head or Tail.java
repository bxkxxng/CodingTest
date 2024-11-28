import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int times = Integer.parseInt(st.nextToken());
            if (times == 0) {
                break;
            }
            st = new StringTokenizer(br.readLine());

            int mary = 0;
            int john = 0;

            for (int i = 0; i < times; i++) {
                int game = Integer.parseInt(st.nextToken());
                if (game == 0) {
                    mary++;
                } else if (game == 1) {
                    john++;
                }
            }
            System.out.println("Mary won " + mary + " times and John won " + john + " times");
        }
    }
}