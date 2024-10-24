import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arg = sc.nextLine().split(" ");
        String[] arg2 = sc.nextLine().split(" ");
        
        for(int i = 0; i < arg.length; i++){
            System.out.print(arg[i]);    
        }

        for(int i = 0; i < arg2.length; i++){
            System.out.print(arg2[i]);    
        }        
    }
}