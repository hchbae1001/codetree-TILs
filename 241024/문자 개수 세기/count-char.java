import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String arg = sc.nextLine();
        char target = sc.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < arg.length(); i++) {
            if (arg.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}