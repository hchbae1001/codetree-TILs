import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        
        String word1 = words[0];
        String word2 = words[1];
        
        int len1 = word1.length();
        int len2 = word2.length();
        
        if (len1 > len2) {
            System.out.println(word1 + " " + len1);
        } else if (len1 < len2) {
            System.out.println(word2 + " " + len2);
        } else {
            System.out.println("same");
        }
    }
}