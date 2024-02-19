package ListAndArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1546 {
    static int N, max,sum;
    static double avg;
    static int[] subject;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        max = 0;
        sum = 0;
        subject = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            subject[i] = Integer.parseInt(st.nextToken());
            max = Math.max(subject[i], max);
            sum += subject[i];
        }
        avg = (double) sum /(N*max)*100;
        System.out.println(avg);
    }
}
