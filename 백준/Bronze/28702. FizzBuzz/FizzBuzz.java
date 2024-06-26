import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, numIndex = 0;

        for (int i = 0; i < 3; i++) {
        String n = br.readLine();
            if (!n.equals("FizzBuzz") && !n.equals("Fizz") && !n.equals("Buzz")) {
                num = Integer.parseInt(n);
                numIndex = i;
            }
        }
        if (numIndex == 2) {
            num += 1;
        } else if(numIndex == 1 ) {
            num += 2;
        } else {
            num += 3;
        }

        // 1   num 2          // Fizz   num 11
        // 2   index 1        //Buzz    index 2
        // ?                  //11

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}