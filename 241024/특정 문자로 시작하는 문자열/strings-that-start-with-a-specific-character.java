import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] arg = new String[n];
        for(int i = 0; i < n; i++){
            arg[i] = sc.next();
        }
        int cnt = 0;
        int sum = 0;
        char target = sc.next().charAt(0);
        for(String tmp : arg){
            if(tmp.charAt(0) == target){
                cnt++;
                sum += tmp.length();
            }
        }
        // 평균 계산
        double averageLength = (double) sum / cnt;
        
        // 출력 (개수와 평균을 소수점 둘째자리까지 출력)
        System.out.printf("%d %.2f\n", cnt, averageLength);
    }
}