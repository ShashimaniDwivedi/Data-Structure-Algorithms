
import java.util.*;

public class DFS {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                           boolean[] visited) {

        // Mark current node as visited
        visited[node] = true;

        // Print current node
        System.out.print(node + " ");

        // Visit all adjacent vertices
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited);
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

        boolean[] visited = new boolean[V];

        // Start DFS from vertex 0
        dfs(0, adj, visited);
    }
}
