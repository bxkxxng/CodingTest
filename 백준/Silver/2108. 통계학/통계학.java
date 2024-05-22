import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> oddMap = new HashMap<>();
        int[] odd = new int[N];

        for (int i = 0; i < N; i++) {
            odd[i] = Integer.parseInt(br.readLine());
            if (oddMap.containsKey(odd[i])) {
                oddMap.put(odd[i], oddMap.get(odd[i]) + 1);
            } else {
                oddMap.put(odd[i], 1);
            }
        }

        int avg = getAvg(odd);
        int mid = getMid(odd);
        int count = getMaxCount(oddMap);
        int range = getRange(odd);

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(count);
        System.out.println(range);
    }

    static int getAvg(int[] arr) {
        return (int) Math.round(Arrays.stream(arr).average().getAsDouble());
    }

    static int getMid(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        return arr[arr.length / 2];
    }

    static int getMaxCount(Map<Integer, Integer> map) {
        int highCount = Collections.max(map.values());
        List<Integer> maxCount = new ArrayList<>();

        for (Map.Entry<Integer, Integer> newMap : map.entrySet()) {
            if (newMap.getValue() == highCount) {
                maxCount.add(newMap.getKey());
            }
        }
        Collections.sort(maxCount);
        if (maxCount.size() > 1) {
            return maxCount.get(1);
        } else {
            return maxCount.get(0);
        }
    }

    static int getRange(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }
}
