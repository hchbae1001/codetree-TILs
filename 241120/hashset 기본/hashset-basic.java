import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String arg = sc.next();
            int num = sc.nextInt();
            if(arg.equals("find")){
                System.out.println(h.contains(num));
            }else if(arg.equals("add")){
                h.add(num);
            }else{
                h.remove(num);
            }
        }
    }
}