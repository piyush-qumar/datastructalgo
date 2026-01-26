package Graph;

import java.util.*;

class DFSTechnique {

    // ---------- DFS ----------
    private void dfs(int start, List<Integer> ans, boolean[] vis, List<List<Integer>> adj) {
        vis[start] = true;
        ans.add(start);

        for (int it : adj.get(start)) {
            if (!vis[it]) {
                dfs(it, ans, vis, adj);
            }
        }
    }

    // ---------- DFS of Graph ----------
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, ans, vis, adj);
            }
        }
        return ans;
    }

    // ---------- BFS of Graph ----------
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> ans = new ArrayList<>();
        //why did we take boolean array instead of list?
        boolean[] arr = new boolean[V];
        for(int i=0;i<V;i++) {
            if(arr[i]==false) {
                bfs(i, ans, arr, adj);
            }
        }
        return ans;
    }

    private void bfs(int start, List<Integer> ans, boolean[] arr, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        arr[start] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            for(int it: adj.get(node)) {
                if(!arr[it]) {
                    arr[it] = true;
                    q.add(it);
                }
            }
        }
    }

    // ---------- main: example usage ----------
    public static void main(String[] args) {
        DFSTechnique demo = new DFSTechnique();

        // Example graph with 7 nodes (0..6), node 6 is isolated to show disconnected handling
        int V = 7;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Build an undirected graph (add both directions)
        addUndirectedEdge(adj, 0, 1);
        addUndirectedEdge(adj, 0, 2);
        addUndirectedEdge(adj, 1, 3);
        addUndirectedEdge(adj, 1, 4);
        addUndirectedEdge(adj, 2, 5);
        // Node 6 remains isolated

        System.out.println("Adjacency list:");
        for (int i = 0; i < V; i++) System.out.println(i + ": " + adj.get(i));

        List<Integer> dfsOrder = demo.dfsOfGraph(V, adj);
        System.out.println("\nDFS order (all components): " + dfsOrder);

        List<Integer> bfsOrder = demo.bfsOfGraph(V, adj);
        System.out.println("BFS order (all components): " + bfsOrder);

        // You can modify edges or V above to test other scenarios.
    }

    // small helper to add undirected edges to the adjacency list used in main
    private static void addUndirectedEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
