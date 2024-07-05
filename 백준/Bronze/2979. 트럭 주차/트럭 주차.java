import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        //  5 3 1
        // 1 6    1 2 3 4 5 6 7 8     1,7,8 
        // 3 5    . . . . . .         2,6 
        // 2 8        . . .           3,4,5
              //    . . . . . . .
        // [0,1,2,3,3,3,2,1,1,0,0,0,...]
        int[] timeArray = new int[100];
        int max = 0, min = 1;
        timeArray[0] = 0;
        for (int i = 1; i <= 3; i++) {
            st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            min = Math.min(min, startTime);
            max = Math.max(max, endTime);
            for (int j = startTime; j < endTime; j++) {
                timeArray[j]++;
            }
        }

        int sum = 0;
        for (int i = min; i < max; i++) {
            int ea = timeArray[i];
            if (ea == 1) {
                sum += ea * A;
            } else if (ea == 2) {
                sum += ea * B;
            } else {
                sum += ea * C;
            }
        }
        System.out.println(sum);
    }
}