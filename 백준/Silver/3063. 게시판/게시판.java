import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int[] xy = new int[8];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 8; j++) {
                xy[j] = Integer.parseInt(st.nextToken());
            }

            int visibleArea = calculateVisibleArea(xy);
            System.out.println(visibleArea);
        }
    }

    public static int calculateVisibleArea(int[] xy) {
        int area1 = (xy[2] - xy[0]) * (xy[3] - xy[1]);

        int overlapWidth = Math.max(0, Math.min(xy[2], xy[6]) - Math.max(xy[0], xy[4]));
        int overlapHeight = Math.max(0, Math.min(xy[3], xy[7]) - Math.max(xy[1], xy[5]));

        int overlapArea = overlapWidth * overlapHeight;

        return area1 - overlapArea;
    }
}