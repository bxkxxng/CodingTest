import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        표의 크기 , 합 계산 갯수
            4 3
        표                        0   0   0   0
            1 2 3 4           0  1   3   6   10
            2 3 4 5           0  3   8   15  24
            3 4 5 6           0  6   15  27  42
            4 5 6 7           0  10  24  42  64
        계산 좌표 (x1,y1)에서 (x2, y2)까지
            2 2 3 4
            3 4 3 4
            1 1 4 4
        * */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int N, M;
        //표 크기
        N = Integer.parseInt(stringTokenizer.nextToken());
        //합 횟수
        M = Integer.parseInt(stringTokenizer.nextToken());

        //draw table
        int[][] array = new int[N + 1][N + 1];
        int[][] sumArray = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            for (int j = 1; j <= N; j++) {
                // 1 2 3 4
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                //index = 1일 때
                sumArray[i][j] = sumArray[i][j - 1] + sumArray[i - 1][j] - sumArray[i - 1][j - 1] + array[i][j];
            }

        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int sum = sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1];

            System.out.println(sum);
        }
    }
}