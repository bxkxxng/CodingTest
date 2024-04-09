import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] sort = new int[N];
        for (int i = 0; i < N; i++) {
            sort[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sort);

        for (int i = 0; i < sort.length; i++) {
            sb.append(sort[i]+"\n");
        }
        System.out.println(sb);
    }
}