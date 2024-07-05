import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String star = "*";
        String space = " ";
        if (N % 2 == 0) {
            System.out.println("I LOVE CBNU");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print(star);
            }
            System.out.println("");
            N = N / 2; // 3 중간지점

            /*

             ******* => N
                *    => N/2
               * *   =>
              *   *
             *     *

            */
            for (int i = 0; i < N + 1; i++) {
                for (int j = 0; j < N - i; j++) { //별 앞 공백 N-1
                    System.out.print(space);
                }
                System.out.print(star);

                //두 별의 공백
                if (i > 0) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        System.out.print(space);
                    }
                    System.out.print(star);
                }
                System.out.println();
            }
        }
    }
}