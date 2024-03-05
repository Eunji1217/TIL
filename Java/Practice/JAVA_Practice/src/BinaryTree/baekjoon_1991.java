package BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1991 {
    static int N;
    static int[][] bTree = new int[26][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node = st.nextToken().charAt(0) - 'A'; // index 변환
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            bTree[node][0] = (left != '.') ?  (left - 'A') :-1;
            bTree[node][1] = (right != '.') ? (right - 'A'):-1;

        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }
    static void preOrder(int node){
        if(node == -1) return;
        System.out.print((char) (node+'A')); // 현재 노드
        preOrder(bTree[node][0]); //왼쪽 노드 탐색
        preOrder(bTree[node][1]); // 오른쪽 노드 탐색
    }
    static void inOrder(int node){
        if(node == -1) return;
        inOrder(bTree[node][0]);
        System.out.print((char)(node+'A'));
        inOrder(bTree[node][1]);
    }
    static void postOrder(int node){
        if(node == -1) return;
        postOrder(bTree[node][0]);
        postOrder(bTree[node][1]);
        System.out.print((char)(node+'A'));

    }
}