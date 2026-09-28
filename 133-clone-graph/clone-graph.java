/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {d
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
import java.util.*;

class Solution {

    // Store original node and its copy
    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {

        // If the graph is empty
        if (node == null) {
            return null;
        }

        // If this node is already copied
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Create a new node with the same value
        Node copy = new Node(node.val);

        // Store the original node and its copy
        map.put(node, copy);

        // Copy all the neighbours
        for (Node n : node.neighbors) {

            // Copy the neighbour node
            Node copyNeighbour = cloneGraph(n);

            // Add the copied neighbour
            copy.neighbors.add(copyNeighbour);
        }

        // Return the copied node
        return copy;
    }
}




















