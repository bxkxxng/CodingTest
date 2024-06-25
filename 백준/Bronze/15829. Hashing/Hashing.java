import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        //abcde => 12345
        //Math.pow
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String word = br.readLine();
        BigInteger M = new BigInteger("1234567891");
        BigInteger sum = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger pow = new BigInteger("1");

        for (int i = 0; i < L; i++) {
            sum = sum.add(new BigInteger(String.valueOf(word.charAt(i) - 96)).multiply(pow));
            pow = pow.multiply(r);
        }
        System.out.println(sum.mod(M));
    }
}