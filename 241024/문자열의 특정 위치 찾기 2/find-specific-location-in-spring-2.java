import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String[] arg = {"apple", "banana", "grape", "blueberry", "orange"};
        char a = sc.next().charAt(0);
        int answer = 0;

        for(String tmp : arg){
            Boolean isIt = false;
            for(int i = 2; i < 4; i++){
                if(tmp.charAt(i) == a){
                    answer++;
                    isIt = true;
                    break;
                }
            }
            if(isIt){
                System.out.println(tmp);
            }
        }

        System.out.println(answer);
    }
}