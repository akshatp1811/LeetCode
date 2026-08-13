/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // Original node -> Cloned node
        HashMap<Node, Node> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();

        // Clone the starting node
        Node clone = new Node(node.val);
        map.put(node, clone);
        queue.add(node);

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            for (Node neighbor : current.neighbors) {

                // If neighbor has not been cloned yet
                if (!map.containsKey(neighbor)) {
                    Node neighborClone = new Node(neighbor.val);

                    map.put(neighbor, neighborClone);
                    queue.add(neighbor);
                }

                // Connect current clone to neighbor clone
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }
}