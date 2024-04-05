import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Member> memberList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Member member = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
            memberList.add(i, member);
        }

        Collections.sort(memberList, Comparator.comparingInt(m -> m.age));

        for (Member member : memberList) {
            System.out.println(member.age + " " + member.name);
        }
    }

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}