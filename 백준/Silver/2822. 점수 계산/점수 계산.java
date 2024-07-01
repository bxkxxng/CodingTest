import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] test = new int[8];
        Map<Integer, Integer> rankScore = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < test.length; i++) {
            test[i] = Integer.parseInt(br.readLine());
            rankScore.put(test[i], i + 1);
        }
        Arrays.sort(test);


        //점수, 문제번호
        int[] testNo = new int[5];
        for (int i = 0; i < testNo.length; i++) {
            testNo[i] = rankScore.get(test[i + 3]);
            sum += test[i + 3];
        }

        System.out.println(sum);
        Arrays.sort(testNo);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testNo.length; i++) {
            sb.append(testNo[i]);
            if (i < testNo.length - 1) {
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}