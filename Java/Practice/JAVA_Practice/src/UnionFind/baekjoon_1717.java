package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1717 - 집합의 표현 (골드5)
public class baekjoon_1717 {
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        for(int i=1; i<N+1;i++){
            arr[i] = i;
        }
        for(int i=0; i<M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int operator= Integer.parseInt(st1.nextToken());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            if(operator==0){
                union(a,b);

            } else if (operator ==1) {
                String ans = (checkSame(a,b))?"YES":"NO";
                System.out.println(ans);
            }
        }
    }
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            arr[b] = a;
        }
    }
    public static int find(int a){ //재귀로 대표 노드 찾기 -> 경로 압축
        if(a==arr[a]) {
            return a;
        } else{
            return arr[a] = find(arr[a]); // a의 대표 노드를 타고타고 올라가서 업데이트
        }
    }
    public static boolean checkSame(int a, int b){
        a = find(a);
        b= find(b);

        return a == b;
    }
}
