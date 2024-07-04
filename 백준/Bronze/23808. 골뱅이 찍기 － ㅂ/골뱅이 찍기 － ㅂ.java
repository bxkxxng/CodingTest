import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

/*
@   @  ->  @@@         @@@
@   @
@@@@@
@   @
@@@@@
*/
        char at = '@';
        char space = ' ';

        for (int j = 0; j < N * 2; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(at);
            }
            for (int i = 0; i < N * 3; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(at);
            }
            System.out.println();
        }
        //=============
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N * 5; i++) {
                System.out.print(at);
            }
            System.out.println();
        }
        // ==================
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(at);
            }
            for (int i = 0; i < N * 3; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(at);
            }
            System.out.println();
        }
        //=============
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N * 5; i++) {
                System.out.print(at);
            }
            System.out.println();
        }
    }
}