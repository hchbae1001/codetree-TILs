import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();

        for(int i = 2; i < 10; i++){
            System.out.print(arg.charAt(i));
        }
    }
}