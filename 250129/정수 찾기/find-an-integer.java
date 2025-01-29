import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        HashSet<Integer> arr1 = new HashSet<>();
        for(int i = 0; i < n; i++) {
            arr1.add(sc.nextInt());
        }
        
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(arr1.contains(num)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}