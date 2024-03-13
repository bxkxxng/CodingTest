import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        Map<Character, Integer> mapList = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            if (mapList.containsKey(word.charAt(i))) {
                mapList.replace(word.charAt(i), mapList.get(word.charAt(i)) + 1); 
            } else {
                mapList.put(word.charAt(i), count);
            }
        }
        char mostFrequentChar = getMostFrequentChar(mapList);
        System.out.println(mostFrequentChar);
    }

    private static char getMostFrequentChar(Map<Character, Integer> map) {
        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            } else if (entry.getValue() == maxCount) {
                mostFrequentChar = '?';
            }
        }
        return mostFrequentChar;
    }
}