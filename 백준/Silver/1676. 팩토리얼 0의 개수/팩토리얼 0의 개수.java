import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        BigInteger bigInteger = factorial(N);
        
        int count = 0;
        String intToStr = bigInteger.toString();
        
        for (int i = intToStr.length()-1 ; i >= 0; i--) {

            if (intToStr.charAt(i) == '0') count++;
            else break;
        }
        System.out.println(count);
    }

    public static BigInteger factorial(int N) {
        if (N <= 1) {
            return BigInteger.ONE;
        } else {
            return factorial(N - 1).multiply(new BigInteger("" + N));
        }
    }
}