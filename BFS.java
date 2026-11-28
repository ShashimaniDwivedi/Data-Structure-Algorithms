
import java.util.*;

public class BFS {

    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        // Mark starting node as visited
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            // Visit all adjacent vertices
            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (Undirected Graph)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(4);

        bfs(0, adj, V);
    }
}
