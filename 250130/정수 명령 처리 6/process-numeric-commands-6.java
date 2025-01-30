import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String arg = st.nextToken();
            
            if(arg.equals("push")) {
                pq.add(Integer.parseInt(st.nextToken()));
            } 
            else if(arg.equals("size")) {
                System.out.println(pq.size());
            }
            else if(arg.equals("empty")) {
                if(pq.size() > 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
            else if(arg.equals("pop")) {
                System.out.println(pq.poll());
            }
            else if(arg.equals("top")) {
                System.out.println(pq.peek());
            }
        }
    }
}