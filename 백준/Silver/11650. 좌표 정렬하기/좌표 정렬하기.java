import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] xy = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int x = Integer.parseInt(st.nextToken());
                xy[i][j] = x;
            }
        }

        Arrays.sort(xy, (x1, x2) -> {
            if(x1[0] == x2[0])  {
                return x1[1] - x2[1];
            }
            else {
                return x1[0] - x2[0];
            }
        });
        
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.print(xy[i][j] + " ");
            }
            System.out.println();
        }
    }
}