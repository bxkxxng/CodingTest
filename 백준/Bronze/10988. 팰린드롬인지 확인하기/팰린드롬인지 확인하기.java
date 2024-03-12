import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String reverseWord = "";
        for (int i = 0; i < word.length(); i++) {
            StringBuffer sb = new StringBuffer(word);
            reverseWord = String.valueOf(sb.reverse());
        }

        if (word.equals(reverseWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}