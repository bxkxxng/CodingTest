import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> sockMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int socks = Integer.parseInt(br.readLine());
            sockMap.put(socks, sockMap.getOrDefault(socks, 0) + 1);
        }
        sockMap.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .forEach(entry2 -> System.out.print(entry2.getKey()));
    }
}