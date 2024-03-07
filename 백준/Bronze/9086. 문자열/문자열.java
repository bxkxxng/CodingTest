import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            print.append(line.substring(0, 1) + line.substring(line.length() - 1, line.length()) + "\n");
        }
        System.out.print(print);
    }
}