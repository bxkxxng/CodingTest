import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        LocalDate birth = LocalDate.of(year, month, day);

        st = new StringTokenizer(br.readLine());
        int standYear = Integer.parseInt(st.nextToken());
        int standMonth = Integer.parseInt(st.nextToken());
        int standDay = Integer.parseInt(st.nextToken());
        LocalDate stand = LocalDate.of(standYear, standMonth, standDay);

        int manAge = stand.minusYears(birth.getYear()).getYear();
        if (birth.plusYears(manAge).isAfter(stand)) {
            manAge--;
        }

        //365일
        //만
        System.out.println(manAge);
        //세는나이
        System.out.println(standYear - year + 1);
        //연나이
        System.out.print(standYear - year);

    }
}