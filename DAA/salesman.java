package DAA;

import java.util.*;

public class salesman {
    static int N;
    static int[][] cost;
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE;

    public static int tsp(int[][] graph) {
        N = graph.length;
        cost = graph;
        visited = new boolean[N];
        visited[0] = true; // Starting from node 0

        branchAndBound(0, 0, 1, new ArrayList<>(Arrays.asList(0)));

        return minCost;
    }

    static void branchAndBound(int currentVertex, int currentCost, int level, List<Integer> path) {
        if (level == N) { // If all cities are visited
            if (cost[currentVertex][0] != 0) {
                minCost = Math.min(minCost, currentCost + cost[currentVertex][0]);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && cost[currentVertex][i] != 0) {
                visited[i] = true;
                currentCost += cost[currentVertex][i];
                path.add(i);

                branchAndBound(i, currentCost, level + 1, path);

                currentCost -= cost[currentVertex][i];
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0,20,10,12},
            {20,0,15,11},
            {10,15,0,17},
            {12,11,17,0},
        };
        int minCost = tsp(graph);
        System.out.println("Minimum cost for TSP: " + minCost);
    }
}


// {0, 5, 0, 6,0,4,0,7},
// {5,0,2,4,3,0,0,0},
// {0,2,0,1,0,0,0,0},
// {6,4,1,0,7,0,0,0},
// {0,3,0,7,0,0,6,4},
// {4,0,0,0,0,0,3,0},
// {0,0,0,0,6,3,0,2},
// {7,0,0,0,4,0,2,0}