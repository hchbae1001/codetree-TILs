import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 원소의 개수
        int m = Integer.parseInt(st.nextToken()); // 질의의 개수

        // 수열 정보 입력
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 수열에 등장하는 각 숫자의 개수를 카운트하여 HashMap에 저장
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 질의 입력 및 결과 저장
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(st.nextToken());
            // 해당 숫자의 등장 횟수를 찾고 없으면 0으로 출력
            sb.append(frequencyMap.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}