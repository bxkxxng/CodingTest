import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        double temp = (double) input / 4763;
        if (Math.floor(temp) != temp) {
            System.out.println(0);
            System.exit(0);
        }

        List<int[]> answer = new ArrayList<>();
        for (int i = 0; i <= 200; i++) {
            for (int j = 0; j <= 200; j++) {
                int x = i;
                int y = j;
                if (temp == x * 508 + y * 212 ||
                    temp == x * 508 + y * 305 ||
                    temp == x * 108 + y * 212 ||
                    temp == x * 108 + y * 305) {
                    answer.add(new int[]{x, y});
                }
            }
        }

        System.out.println(answer.size());
        for (int[] pair : answer) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}