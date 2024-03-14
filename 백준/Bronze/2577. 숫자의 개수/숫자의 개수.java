import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int time = A * B * C;
        
        Map<Integer, Integer> countMap = new HashMap<>();
        String timeString = String.valueOf(time);
        for (int i = 0; i < 10; i++) {
            countMap.put(i, 0);
        }
        
        for (int i = 0; i < timeString.length(); i++) {
            int num = Character.getNumericValue(timeString.charAt(i));
            countMap.replace(num, countMap.get(num) + 1);
        }
        
        countMap.forEach((k, v) -> System.out.println(v));
    }
}