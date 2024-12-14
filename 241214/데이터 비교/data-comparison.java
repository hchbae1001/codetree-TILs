import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            h.add(sc.nextInt());
        }
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int v : arr){   
            if(h.contains(v)){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
    }
}