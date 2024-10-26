import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 줄바꿈 문자 제거

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] arg = command.split(" ");
            
            if (arg[0].equals("add")) {
                int k = Integer.parseInt(arg[1]);
                int v = Integer.parseInt(arg[2]);
                m.put(k, v);
            } else if (arg[0].equals("remove")) {
                int k = Integer.parseInt(arg[1]);
                m.remove(k);
            } else if (arg[0].equals("find")) {
                int k = Integer.parseInt(arg[1]);
                if (m.containsKey(k)) {
                    System.out.println(m.get(k));
                } else {
                    System.out.println("None");
                }
            }
        }
    }
}