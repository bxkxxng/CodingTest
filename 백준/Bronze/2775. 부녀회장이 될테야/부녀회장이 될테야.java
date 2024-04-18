import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int[][] apartment = new int[15][15];
            for (int j = 0; j < apartment.length; j++) {
                apartment[j][1] = 1; 
                apartment[0][j] = j; 
            }

            for (int k = 1; k < apartment.length; k++) { 
                for (int n = 2; n < apartment.length; n++) { 
                    apartment[k][n] = apartment[k][n - 1] + apartment[k - 1][n];
                }
            }

            System.out.println(apartment[K][N]);
        }
    }
}