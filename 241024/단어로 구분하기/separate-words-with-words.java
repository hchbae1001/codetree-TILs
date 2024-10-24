import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arg = new Scanner(System.in).nextLine().split(" ");
        for(String tmp : arg){
            System.out.println(tmp);
        }
    }
}