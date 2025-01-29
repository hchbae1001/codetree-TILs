import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> tmp = new HashSet<>();  // 제네릭 타입 지정
        for(int i = 0; i<n;i++){
            tmp.add(sc.nextInt());
        }
        System.out.println(tmp.size());
    }
}