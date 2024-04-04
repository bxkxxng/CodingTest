import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int documentCount = Integer.parseInt(st.nextToken());
            int order = Integer.parseInt(st.nextToken());
            Queue<Integer> queueWithImport = new LinkedList<>();
            Queue<Integer> queueWithDocument = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < documentCount; j++) {
                queueWithImport.offer(Integer.parseInt(st.nextToken())); //중요도
                queueWithDocument.offer(j); //index
            }
            //맨앞의 값과 중요도 비교.
            int printCount = 1;
                /*
                *
                4 2=C 문서개수,
                1 2 3 4 중요도
                A B C D => D C B A
                * */
            while (!queueWithImport.isEmpty()) {
                int maxImportanceNum = Collections.max(queueWithImport); //가장 큰 중요도
                int currentDocument = queueWithImport.poll(); //현재문서
                int currentDocumentIndex = queueWithDocument.poll(); // 현재 인덱스

                if (currentDocument == maxImportanceNum) { //프린트 가능할 때
                    if (currentDocumentIndex == order) {
                        System.out.println(printCount);
                        break;
                    }
                    printCount++;

                } else {
                    queueWithImport.offer(currentDocument);
                    queueWithDocument.offer(currentDocumentIndex);
                }
            }
        }
    }
}