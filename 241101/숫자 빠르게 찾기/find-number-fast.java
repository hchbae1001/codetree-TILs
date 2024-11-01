import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            int position = binarySearch(arr, target);
            System.out.println(position);
        }

        sc.close();
    }

    // 이진 탐색 메소드
    private static int binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == target) {
                return mid + 1; // 1-based index로 반환
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // 배열에 target이 없는 경우
    }
}