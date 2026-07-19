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
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Tuple>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int t = times[i][2];
            adj.get(u).add(new Tuple(u,v,t));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, (int) 1e9);
        dist[k] = 0; 

        PriorityQueue<Tuple> pq = new PriorityQueue<>((a, b) -> a.first - b.first);
        pq.add(new Tuple(0, k, 0));
        int adjWt,delTime,node,distance;
        while(!pq.isEmpty()){
            delTime = pq.peek().first;
            node = pq.peek().second;
            pq.remove();
            for(Tuple it : adj.get(node)){
                adjWt = it.third;
                if(delTime + adjWt < dist[it.second]){
                    dist[it.second] = delTime + adjWt;
                    distance = dist[it.second];
                    pq.add(new Tuple(distance,it.second,0));
                }
            }
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == (int)1e9) return -1;
            max = Math.max(max, dist[i]);
        }
        return max;
    }
}