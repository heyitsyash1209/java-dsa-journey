package DSA.Graph;

import java.util.*;

public class bsf_dsf {

    // BFS
    public static void bfs(ArrayList<Integer>[] graph, int start, int V) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int nei : graph[node]) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }

    // DFS
    public static void dfs(ArrayList<Integer>[] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : graph[node]) {
            if (!visited[nei]) {
                dfs(graph, nei, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // edges
        graph[0].add(1); graph[1].add(0);
        graph[0].add(2); graph[2].add(0);
        graph[1].add(3); graph[3].add(1);
        graph[1].add(4); graph[4].add(1);

        System.out.print("BFS: ");
        bfs(graph, 0, V);

        System.out.println();

        System.out.print("DFS: ");
        boolean[] visited = new boolean[V];
        dfs(graph, 0, visited);
    }
}