import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String arg = sc.next();
        for(int i = 1; i < arg.length(); i++){
            sb.append(arg.charAt(i));
        }
        sb.append(arg.charAt(0));
        System.out.println(sb.toString());
    }
}