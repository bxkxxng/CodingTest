import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] alphabetArray = new int[26];

        Arrays.fill(alphabetArray, -1);

        for (int i = 0; i < S.length(); i++) {
            char alphabet = S.charAt(i);
            if(alphabetArray[alphabet - 97] == -1) {
                alphabetArray[alphabet - 97] = i;
            }
        }
        Arrays.stream(alphabetArray).forEach(i -> System.out.print(i+" "));
    }
}
