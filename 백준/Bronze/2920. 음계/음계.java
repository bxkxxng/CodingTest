import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] music = new int[8];
        for (int i = 0; i < music.length; i++) {
            music[i] = Integer.parseInt(st.nextToken());
        }

        int[] asc = new int[8];
        for (int i = 0; i < asc.length; i++) {
            asc[i] = i + 1;
        }
        int[] desc = new int[asc.length];
        for (int i = 0; i < desc.length; i++) {
            desc[i] = asc[desc.length - i - 1];
        }

        if (Arrays.equals(music, asc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(music, desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}