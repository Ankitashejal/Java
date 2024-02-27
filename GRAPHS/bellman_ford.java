package GRAPHS;

import java.util.*;


class bellman_ford {
    static int[] bellman(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;

        // V - 1 relaxations
        for (int i = 0; i < V - 1; i++) {
            for (ArrayList<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);
                int wt = edge.get(2);
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Negative cycle detection
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int wt = edge.get(2);
            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                return null; // Negative cycle detected
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 7;
        int S = 0;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {{
            add(new ArrayList<>(Arrays.asList(0, 1, 5)));
            add(new ArrayList<>(Arrays.asList(0, 2, 6)));
            add(new ArrayList<>(Arrays.asList(0, 3, 5)));
            add(new ArrayList<>(Arrays.asList(1, 4, -1)));
            add(new ArrayList<>(Arrays.asList(2, 3, -2)));
            add(new ArrayList<>(Arrays.asList(2, 4, 1)));
            add(new ArrayList<>(Arrays.asList(3, 5, -2)));
            add(new ArrayList<>(Arrays.asList(4, 6, 3)));
            add(new ArrayList<>(Arrays.asList(5, 6, 3)));
        }};

        int[] dist = bellman_ford.bellman(V, edges, S);
        if (dist == null) {
            System.out.println("Negative cycle detected!");
        } else {
            for (int i = 0; i < V; i++) {
                System.out.print(dist[i] + " ");
            }
            System.out.println();
        }
    }
}
