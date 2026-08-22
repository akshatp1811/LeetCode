class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency List
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        // Populate Adjacency List
        for(int i = 0; i < prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        // Indegree Array
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            for(int neighbor : adj.get(i)){
                indegree[neighbor]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0)
                q.offer(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.poll();

            ans.add(node);

            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;

                if(indegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }

        if(ans.size() != numCourses)
            return new int[0];

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}