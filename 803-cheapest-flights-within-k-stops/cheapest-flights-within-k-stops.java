import java.util.*;

class Tuple {
    int first;
    int second;
    int third;

    Tuple(int _first, int _second, int _third) {
        first = _first;
        second = _second;
        third = _third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<Tuple>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            int u = flights[i][0];
            int v = flights[i][1];
            int wt = flights[i][2];
            adj.get(u).add(new Tuple(0, v, wt));
        }

        int[] dist = new int[n];
        Arrays.fill(dist, (int) 1e9);
        dist[src] = 0;

        PriorityQueue<Tuple> q = new PriorityQueue<>((a, b) -> a.first - b.first);
        q.add(new Tuple(0, src, 0));

        while (!q.isEmpty()) {
            Tuple curr = q.poll();

            int stops = curr.first;
            int node = curr.second;
            int cost = curr.third;

            if (stops > k) continue;

            for (Tuple it : adj.get(node)) {
                int adjNode = it.second;
                int edgeWt = it.third;

                if (cost + edgeWt < dist[adjNode] && stops <= k) {
                    dist[adjNode] = cost + edgeWt;
                    q.add(new Tuple(stops + 1, adjNode, dist[adjNode]));
                }
            }
        }

        return dist[dst] == (int) 1e9 ? -1 : dist[dst];
    }
}