import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String quiz = br.readLine();
            checkScore(quiz);
        }
    }

    static void checkScore(String quiz) {
        int score = 0;
        int seq = 0;

        for (int i = 0; i < quiz.length(); i++) {
            if (String.valueOf(quiz.charAt(i)).equals("O")) {
                seq++;
                score += seq;
            } else {
                seq = 0;
            }
        }
        System.out.println(score);
    }
}