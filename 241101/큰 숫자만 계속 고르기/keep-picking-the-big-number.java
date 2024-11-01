import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] arg = sc.nextLine().split(" ");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : arg) {
            pq.add(Integer.parseInt(s));
        }

        while (m-- > 0) {
            int max = pq.poll();
            pq.add(max - 1);
        }

        System.out.println(pq.peek());
        sc.close();
    }
}