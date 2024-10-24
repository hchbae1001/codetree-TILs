import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int totalLength = 0;
        int countA = 0;
        
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            totalLength += str.length();
            if (str.charAt(0) == 'a') {
                countA++;
            }
        }
        
        // 총 길이와 'a'로 시작하는 문자열의 개수 출력
        System.out.println(totalLength + " " + countA);
    }
}