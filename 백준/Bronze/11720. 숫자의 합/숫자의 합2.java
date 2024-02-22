import java.util.Scanner;

// memory 17748KB, time 204ms
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String addNum = sc.next();
        int sum = 0;
        int[] addInt = new int[addNum.length()];
        for (int i = 0; i < addNum.length(); i++) {
            addInt[i] = Character.getNumericValue(addNum.charAt(i));
        }
        for(int numIntArr : addInt) {
            sum += numIntArr;
        }
        System.out.println(sum);
    }
}
