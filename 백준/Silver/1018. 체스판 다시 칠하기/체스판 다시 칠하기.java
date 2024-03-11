import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        String[] black = new String[8];
        String[] white = new String[8];
        for (int i = 0; i < 8; i++) {
            black[i] = i % 2 == 0 ? "BWBWBWBW" : "WBWBWBWB";
            white[i] = i % 2 == 0 ? "WBWBWBWB" : "BWBWBWBW";
        }

        int count = 8 * 8;

        for (int i = 0; i < (N - 7); i++) {
            for (int j = 0; j < (M - 7); j++) {
                int wCount = 0;
                int bCount = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (white[k].charAt(l) != board[k + i].charAt(l + j)) wCount++;
                        if (black[k].charAt(l) != board[k + i].charAt(l + j)) bCount++;
                    }
                }
                count = Math.min(count, Math.min(wCount, bCount));
            }
        }
        System.out.println(count);
    }
}