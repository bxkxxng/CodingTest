import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0 && C == 0) {
                break;
            }
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("right");
            } else if (Math.pow(B, 2) == Math.pow(A, 2) + Math.pow(C, 2)) {
                System.out.println("right");
            } else if (Math.pow(C, 2) == Math.pow(A, 2) + Math.pow(B, 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}