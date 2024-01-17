import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        long a;
        long b;
        long c;
        a = Long.parseLong(stringTokenizer.nextToken());
        b = Long.parseLong(stringTokenizer.nextToken());
        c = Long.parseLong(stringTokenizer.nextToken());
        System.out.println(a + b + c);
    }
}