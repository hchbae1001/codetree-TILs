import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String[] arg = sc.nextLine().split(" ");
        for(String tmp : arg){
            answer += tmp.length();
        }
        System.out.print(answer);
    }
}