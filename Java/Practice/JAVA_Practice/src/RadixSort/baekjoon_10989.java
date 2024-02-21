package RadixSort;

import java.io.*;

public class baekjoon_10989 {
    static int N;
    static int[] arr;

    public static void Radix_Sort(int[] arr, int max_size){
        int[] output = new int[arr.length];
        int jarisu = 1;
        int count = 0;
        while(count != max_size){       // 최대 자릿수만큼 반복
            int[] bucket = new int[10];
            for(int i=0; i <arr.length; i++){
                bucket[(arr[i]/jarisu)%10]++; // 일의 자리부터 시작하기
            }
            for(int i = 1; i <10; i++){ // 합 배열을 이용해 index 계산하기
                bucket[i] += bucket[i-1];
            }
            for(int i = arr.length-1; i>=0; i--){ // 현재 자릿수를 기준으로 정렬
                output[bucket[(arr[i]/jarisu%10)]-1] = arr[i];
                bucket[(arr[i]/jarisu)%10]--;
            }
            for(int i = 0; i <arr.length; i++){
                // 다음 자릿수를 이동하기 위해 현재 자릿수 기준 정렬 데이터 정하기
                arr[i] = output[i];
            }
            jarisu = jarisu * 10;
            count++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr= new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Radix_Sort(arr,5);
        for(int i = 0; i < N; i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
