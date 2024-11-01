import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int tmp = sc.nextInt();
            if(tmp == 0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(tmp);
            }
        }
    }
}