import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        Map<String, String> sitePassword = new HashMap<>();
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            sitePassword.put(site,password);
        }

        String findPassword = "";
        for(int i = 0; i<count; i++) {
            String findSite = br.readLine();
            findPassword = sitePassword.get(findSite);
            bw.write(findPassword+"\n");
        }
        bw.flush();
    }
}