import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<Integer, String[]> score = new HashMap<>();
        score.put(1, new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M"});
        score.put(2, new String[]{"A", "C", "E", "F", "G", "H", "I", "L", "M"});
        score.put(3, new String[]{"A", "C", "E", "F", "G", "H", "I", "L", "M"});
        score.put(4, new String[]{"A", "B", "C", "E", "F", "G", "H", "L", "M"});
        score.put(5, new String[]{"A", "C", "E", "F", "G", "H", "L", "M"});
        score.put(6, new String[]{"A", "C", "E", "F", "G", "H", "L", "M"});
        score.put(7, new String[]{"A", "C", "E", "F", "G", "H", "L", "M"});
        score.put(8, new String[]{"A", "C", "E", "F", "G", "H", "L", "M"});
        score.put(9, new String[]{"A", "C", "E", "F", "G", "H", "L", "M"});
        score.put(10, new String[]{"A", "B", "C", "F", "G", "H", "L", "M"});
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(score.get(N).length);
        for(int i = 0; i < score.get(N).length; i++) {
            System.out.print(score.get(N)[i] + " ");
        }
    }
}