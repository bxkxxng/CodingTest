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
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xy, (xy1, xy2) -> {
            if (xy1[1] == xy2[1]) {
                return xy1[0] - xy2[0];
            } else {
                return xy1[1] - xy2[1];
            }
        });
        for (int i = 0; i < xy.length; i++) {
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}