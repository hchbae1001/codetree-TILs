import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] arg = sc.nextLine().split(" ");

        for(String s : arg){
            int tmp = Integer.parseInt(s);
            pq.add(tmp);
        }
        for(int i = 0; i < m; i++){
            int tmp = pq.poll();
            pq.add(tmp-1);
        }
        System.out.println(pq.poll());
    }
}