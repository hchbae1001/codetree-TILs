import java.util.*;
public class Main {
    public static void main(String[] args) {
        String arg = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < arg.length(); i+=2){
            sb.append(arg.charAt(i));
        }
        sb.reverse();
        System.out.print(sb.toString());
    }
}