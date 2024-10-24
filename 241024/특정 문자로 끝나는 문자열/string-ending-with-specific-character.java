import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arg = new String[10];
        for(int i = 0; i < 10; i++){
            arg[i] = sc.nextLine();
        }
        char target = sc.next().charAt(0);
        for(String tmp : arg){
            if(tmp.charAt(tmp.length()-1) == target){
                System.out.println(tmp);
            }
        }

    }
}