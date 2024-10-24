import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arg = sc.nextLine().split(" ");
        Map<Integer,String> tmp = new HashMap<>();
        int max = 0;
        for(String i : arg){
            int len = i.length();
            tmp.put(len, i);
            if(max < len){
                max = len;
            }else if (max == len){
                System.out.println("same");
                return;
            }
        }
        System.out.print(tmp.get(max)+ " " + max);
    }
}