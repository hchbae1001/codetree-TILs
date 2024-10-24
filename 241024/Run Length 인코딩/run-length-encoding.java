import java.util.*;
public class Main {
    public static void main(String[] args) {
        String arg = new Scanner(System.in).nextLine();
        char target = arg.charAt(0);
        String answer = "";
        int cnt = 1;
        for(int i = 1; i < arg.length(); i++){
            if(arg.charAt(i) == target){
                cnt++;
            }else{
                String tmp = target + String.valueOf(cnt);
                answer += tmp;
                target = arg.charAt(i);
                cnt = 1;
            }
        }
        String tmp = target + String.valueOf(cnt);
        answer += tmp;
        System.out.println(answer.length());
        System.out.println(answer);
    }
}