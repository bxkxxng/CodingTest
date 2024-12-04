import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //*        *
        //**      **
        //***    ***
        //****  ****
        //**********
        //****  ****
        //***    ***
        //**      **
        //*        *
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j <= i && i < N || j <= (2 * N - 2 - i) && i >= N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < N; j++) {
                if (j >= (N - 1 - i) && i < N || j >= (i - N + 1) && i >= N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}