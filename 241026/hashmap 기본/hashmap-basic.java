import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 명령의 수
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();  // 명령어
            int key = scanner.nextInt();      // key값

            switch (command) {
                case "add":
                    int value = scanner.nextInt();
                    map.put(key, value);       // key, value 쌍 추가 (덮어쓰기 가능)
                    break;
                
                case "remove":
                    map.remove(key);           // key 값 제거
                    break;

                case "find":
                    if (map.containsKey(key)) {
                        result.append(map.get(key)).append("\n");  // 값 출력
                    } else {
                        result.append("None\n");   // 없으면 None 출력
                    }
                    break;
            }
        }
        
        System.out.print(result.toString());
        scanner.close();
    }
}