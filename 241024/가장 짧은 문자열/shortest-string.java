import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] lengths = new int[3];

        for (int i = 0; i < 3; i++) {
            lengths[i] = sc.next().length();
        }

        int minLength = lengths[0];
        int maxLength = lengths[0];
        
        for (int i = 1; i < 3; i++) {
            if (lengths[i] < minLength) {
                minLength = lengths[i];
            }
            if (lengths[i] > maxLength) {
                maxLength = lengths[i];
            }
        }

        System.out.println(maxLength - minLength);
    }
}