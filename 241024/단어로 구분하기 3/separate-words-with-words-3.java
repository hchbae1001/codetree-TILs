import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arg = new Scanner(System.in).nextLine().split(" ");
        for(int i = arg.length-1; i >= 0; i--){
            System.out.println(arg[i]);
        }
    }
}