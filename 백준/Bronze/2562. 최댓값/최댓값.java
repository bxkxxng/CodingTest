import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numList = new int[9];
        for (int i = 0; i < 9; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }
        OptionalInt maxNum = Arrays.stream(numList).max();
        int index = 0;
        for (int i = 0; i<numList.length; i++) {
            if(numList[i] == maxNum.getAsInt()) index = i;
        }
        System.out.println(maxNum.getAsInt());
        System.out.println(index+1);
    }
}