import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            words.add(sc.nextLine());
        }
        
        Collections.reverse(words);
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}