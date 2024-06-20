import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 참가자수
        int[] size = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size.length; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        //티셔츠 수
        int T = Integer.parseInt(st.nextToken());

        //펜 수
        int P = Integer.parseInt(st.nextToken());

        //[S, M, L, XL, XXL, XXXL]

        int Tcount = 0;
        int Pcount = N/P;
        int PcountPercentP = N%P;

        for(int i = 0; i < size.length; i++) {
            Tcount += size[i] / T;
            if(size[i] % T != 0) {
                Tcount++;
            }
        }

        System.out.println(Tcount);
        System.out.println(Pcount + " " + PcountPercentP);
    }
}