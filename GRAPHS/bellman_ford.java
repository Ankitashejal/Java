package GRAPHS;

import java.util.*;

class bellman_ford {
    static int[] bellman(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++)
            dist[i] = (int) (1e8);
        dist[S] = 0;
        // V x E
        for (int i = 0; i < V - 1; i++) {
            for (ArrayList<Integer> it : edges) {
                int u = it.get(0);
                int v = it.get(1);
                int wt = it.get(2);
                if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        // Nth relaxation to check negative cycle
        for (ArrayList<Integer> it : edges) {
            int u = it.get(0);
            int v = it.get(1);
            int wt = it.get(2);
            if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {
                int temp[] = new int[1];
                temp[0] = -1;
                return temp;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 7;
        int S = 0; // Adjusted the source vertex index
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<Integer>(Arrays.asList(1, 3, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(1, 4, 5)));
                add(new ArrayList<Integer>(Arrays.asList(2, 5, -1)));
                add(new ArrayList<Integer>(Arrays.asList(3, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 5, 1)));
                add(new ArrayList<Integer>(Arrays.asList(4, 3, -2)));
                add(new ArrayList<Integer>(Arrays.asList(4, 6, 3)));
                add(new ArrayList<Integer>(Arrays.asList(5, 7, 3)));
                add(new ArrayList<Integer>(Arrays.asList(6, 7, 3)));
            }
        };

        int[] dist = bellman_ford.bellman(V, edges, S);
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println("");
    }

}
