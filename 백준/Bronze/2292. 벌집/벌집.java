import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bulzipCount = 1;
        int roomCount = 1;
        int room = 0;

        while (N != 1) {
            bulzipCount += (room * 6);
            if (N <= bulzipCount) break;

            roomCount++;
            room++;

        }

        System.out.println(roomCount);
    }
}