
import java.util.*;

//Graph creation
public class graph {
    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int n) {

        boolean[] visited = new boolean[n + 1];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void dfs(int node, boolean[] visited,
            ArrayList<ArrayList<Integer>> adj) {

        // Mark current node visited
        visited[node] = true;

        // Print current node
        System.out.print(node + " ");

        // Visit all adjacent nodes
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(4).add(5);
        adj.get(5).add(4);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(4).add(3);
        adj.get(3).add(4);
        // bfs(1, adj, n);
        boolean[] visited = new boolean[n + 1];
        dfs(1, visited, adj);

        // for (int i = 1; i <= n; i++) {
        // for (int j = 0; j < adj.get(i).size(); j++) {
        // System.out.print(adj.get(i).get(j) + " ");
        // }
        // System.out.println();
        // }
    }
}
