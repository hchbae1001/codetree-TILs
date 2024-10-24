import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();

        System.out.print(arg.substring(2, Math.min(10, arg.length())));
    }
}