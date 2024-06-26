import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int except = (int) Math.round(n * 0.3 / 2);
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(score);
        int[] cutArray = Arrays.copyOfRange(score, except, score.length - except);
        OptionalDouble averageOptinal = Arrays.stream(cutArray).average();
        int avg = (int) Math.round(averageOptinal.orElse(0.0));
        System.out.println(avg);
    }
}