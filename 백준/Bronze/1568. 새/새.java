import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bird = 1;
        /*
        14 -> 1 = 1s
        13 -> 2 = 2s
        11 -> 3 = 3s
        8 -> 4 = 4s
        4 -> 1 = 5s
        3 -> 2 = 6s
        1 -> 1 = 7s
        */

        int sec = 0;
        while (N >= 1) {
            if (N < bird) {
                bird = 1;
            }
            N -= bird;
            bird++;
            sec++;
        }
        System.out.println(sec);
    }
}