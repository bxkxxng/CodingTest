import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger B = new BigInteger(br.readLine()) ;
        BigInteger result;
        if(operator.equals("+")){
            result = A.add(B);
        } else {
            result = A.multiply(B);
        }
        System.out.print(result);
    }
}