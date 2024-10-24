import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arg = new Scanner(System.in).nextLine().split(" ");
        for(int i = 0; i < arg.length; i+=2){
            System.out.println(arg[i]);
        }
    }
}