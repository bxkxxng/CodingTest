import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //재료
        int M = Integer.parseInt(br.readLine()); //합

        int[] suit = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            suit[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        HashMap<Integer, Integer> Nmap = new HashMap<>();

        for (int num : suit) {
            int complement = M - num;
            if (Nmap.containsKey(complement) && Nmap.get(complement) > 0) {
                count++;
                Nmap.put(complement, Nmap.get(complement) - 1);
            } else {
                Nmap.put(num, Nmap.getOrDefault(num, 0) + 1);
            }
        }
        System.out.println(count);
    }
}