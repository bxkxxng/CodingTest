import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        //최대 공약수 a가 큰 수
        int max = a > b ? getGCD(a, b) : getGCD(b, a);

        //최소 공배수 a*b/max
        System.out.println(max); //최대 공약수
        System.out.println(a * b / max);
    }

    static int getGCD(int a, int b) {
        if(b==0) return a;
        int remainder = a % b;
        //b, remainder
        return getGCD(b, remainder);
    }
}