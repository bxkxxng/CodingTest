import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[Integer.parseInt(br.readLine())]; //A배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int[] M = new int[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M.length; i++) {
            M[i] = Integer.parseInt(st.nextToken());
            int result = binarySearch(A, M[i]);
            System.out.println(result);
        }
    }

    static int binarySearch(int[] A, int M) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (M == A[mid]) {
                return 1;
            } else if (M < A[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}