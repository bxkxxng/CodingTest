import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String print = "";
        for (int i = 0; i < word.length(); i++) {
            String changeWord = String.valueOf(word.charAt(i));
            if (word.charAt(i) >= 65 && word.charAt(i) < 91) {
                print += changeWord.toLowerCase();
            } else if (word.charAt(i) >= 97 && word.charAt(i) < 123) {
                print += changeWord.toUpperCase();
            } else {
                print += changeWord;
            }
        }
        System.out.println(print);
    }
}