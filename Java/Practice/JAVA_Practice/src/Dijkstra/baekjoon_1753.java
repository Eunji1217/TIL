package Dijkstra;
//백준 1753 - 최단경로(골드4)
// 방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점으로의 최단 경로를 구하는 프로그램 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class baekjoon_1753 {
    static int V,E,K;
    static ArrayList<Edge>[] list; // 연결 리스트
    static int[] distance; // 최단 거리 배열
    static boolean[] visited;// 방문 배열
    static PriorityQueue<Edge> q = new PriorityQueue<Edge>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        distance = new int[V+1];
        visited = new boolean[V+1];
        list = new ArrayList[V+1];
        for(int i=1; i <=V; i++){ // 각 노드 별 연결 리스트 생성해주고 최단거리배열 무한대로 초기화
            list[i] = new ArrayList<Edge>();
            distance[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i < E; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st1.nextToken());
            int v = Integer.parseInt(st1.nextToken());
            int w = Integer.parseInt(st1.nextToken());
            list[u].add(new Edge(v,w));
        }
        q.add(new Edge(K,0)); // K를 시작점으로 설정 K - 시작노드, 시작노드의 가중치 - 0
        distance[K] = 0;
        while (!q.isEmpty()){
            Edge current = q.poll(); // 제일 가중치가 작은값 꺼내기
            int c_v = current.vertex;
            if(visited[c_v]) continue; // 방문한 노드는 pass
            visited[c_v] = true;
            for(int i = 0; i < list[c_v].size(); i++){
                Edge tmp = list[c_v].get(i);
                int next = tmp.vertex;
                int value = tmp.value;
                // (전 연결노드의 배열값 + 가중치 )vs (해당 노드 배열값) 중 작은 값 고르기
                if(distance[next]>distance[c_v]+value){ // -> 최소 거리 업데이트
                    distance[next] = value + distance[c_v];
                    q.add(new Edge(next, distance[next]));
                }
            }
        }
        for(int i=1; i <=V; i++){
            if(visited[i]){
                System.out.println(distance[i]);
            } else {// 방문하지 못햇다 -> 불가능
                System.out.println("INF");
            }
        }
    }
    static class Edge implements Comparable<Edge>{ // 가중치가 있는 그래프를 담기 위한 클래스 별도 구현
        int vertex, value; // vertex - 해당 노드 , value - 에지의 가중치
        Edge(int vertex, int value){
            this.value = value;
            this.vertex = vertex;
        }

        @Override
        public int compareTo(Edge e) { // 우선순위 큐 정렬 기준 위해 무조건 구현!
            if(this.value > e.value) return 1;
            else return -1;
        }
    }
}
