import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine()); //동아리 학생 수

        //1,2반에는 소프트웨어개발과,
        //3반에는 임베디드소프트웨어개발과,
        //4반에는 인공지능소프트웨어개발과
        int ban1and2 = 0;
        int ban3 = 0;
        int ban4 = 0;
        int grade1 = 0;

        for (int i = 0; i < P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken());
            int ban = Integer.parseInt(st.nextToken());
            if (grade != 1) {
                if (ban == 1 || ban == 2) {
                    ban1and2++;
                } else if (ban == 3) {
                    ban3++;
                } else
                    ban4++;
            } else {
                grade1++;
            }
        }
        System.out.println(ban1and2);
        System.out.println(ban3);
        System.out.println(ban4);
        System.out.println(grade1);
    }
}