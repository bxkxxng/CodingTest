import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            //원주 = 2 * pie * 반지름
            double diameter = Double.parseDouble(st.nextToken()); //inch
            double rotations = Double.parseDouble(st.nextToken());
            if (rotations == 0) {
                break;
            }
            double seconds = Double.parseDouble(st.nextToken()); //second
            double PI = Math.PI;

            //1 in ÷ 63360 = 0.000015783 mi
            double miles = 1 / 63360.0;
            //1시간 * 60분 * 60초 = 3600초
            double hours = seconds / 3600.0;

            double totalDistance = diameter * PI * rotations * miles;
            double avgSpeed = totalDistance / hours;

            //Trip #N: distance MPH
            System.out.printf("Trip #%d: %.2f %.2f%n", N, Math.round(totalDistance * 100.0) / 100.0, Math.round(avgSpeed * 100.0) / 100.0);
            N++;
        }
    }
}