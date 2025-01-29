import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // 내림차순 정렬을 위한 TreeSet 생성
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        // n개의 숫자 입력받아 TreeSet에 저장
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int num : set) {
            if(count < k) {
                sb.append(num).append(" ");
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(sb.toString().trim());
        br.close();
    }
}