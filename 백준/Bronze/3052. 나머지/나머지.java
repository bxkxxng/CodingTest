import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] modArray = new int[10];
        for (int i = 0; i < modArray.length; i++) {
            modArray[i] = Integer.parseInt(br.readLine());
        }
        int[] mod = new int[modArray.length];
        for (int i = 0; i < mod.length; i++) {
            mod[i] = modArray[i] % 42;
        }
        System.out.println(Arrays.stream(mod).distinct().count());
    }
}