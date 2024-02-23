package Greedy;
// 카드 정렬하기 - 백준 1715 - 골드 4
// N개의 숫자 카드 묶음의 각각의 크기가 주어질 때, 최소한 몇 번의 비교가 필요한지 구하기
// 예시 -> 10 20 40
// 최소 -> (10+20) + (30+40) = 100
// (10 + 40) + (50 +30 ) 인 경우는 120
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baekjoon_1715 {
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            int data = Integer.parseInt(br.readLine());
            pq.add(data);
        }
        // 우선순위 큐는 기본적으로 add 시 오름차순 정렬이 된다!
        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        while(pq.size() !=1){
            data1 = pq.remove();
            data2 = pq.remove();
            sum += data1 + data2;
            pq.add(data1+data2); // 다시 오름차순으로 정렬됨 -> 최적해(그리디) 산출 easy
        }
        System.out.println(sum);
    }
}
