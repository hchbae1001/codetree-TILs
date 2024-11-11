import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 보석 개수
        int M = sc.nextInt();  // 가방의 크기
        
        // 보석의 정보를 저장할 리스트
        List<double[]> jewels = new ArrayList<>();
        
        // 보석 정보 입력
        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            jewels.add(new double[]{weight, value, (double)value / weight});  // 무게, 가치, 무게당 가치
        }
        
        // 무게당 가치가 높은 순서대로 정렬
        jewels.sort((a, b) -> Double.compare(b[2], a[2]));
        
        double maxValue = 0.0;  // 최대 가치 저장 변수
        int currentWeight = 0;  // 현재 가방에 담긴 무게
        
        for (double[] jewel : jewels) {
            if (currentWeight >= M) break;  // 가방이 다 찼으면 종료
            
            double weight = jewel[0];
            double value = jewel[1];
            double valuePerWeight = jewel[2];
            
            if (currentWeight + weight <= M) {
                // 보석 전체를 담을 수 있는 경우
                currentWeight += weight;
                maxValue += value;
            } else {
                // 가방에 남은 공간에 맞게 일부만 담는 경우
                int remainWeight = M - currentWeight;
                maxValue += remainWeight * valuePerWeight;
                currentWeight += remainWeight;  // 사실상 가방이 다 찬 상태
            }
        }
        
        // 결과 출력 (소수점 셋째 자리까지)
        System.out.printf("%.3f", maxValue);
    }
}