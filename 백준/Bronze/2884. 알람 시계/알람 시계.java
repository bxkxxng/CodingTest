import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LocalTime alarm = LocalTime.of(H, M);
        LocalTime minusAlarm = alarm.minusMinutes(45);
        System.out.println(minusAlarm.getHour()+" "+minusAlarm.getMinute());
    }
}