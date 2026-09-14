/*
Definition for a Node.
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

    private Node dfs(Node node, Map<Node, Node> oldToNew){
        // if node in old
        if(node == null) {
            return null;
        }
        if(oldToNew.containsKey(node)){
            return oldToNew.get(node);
        }

        Node copy = new Node(node.val);
        oldToNew.put(node, copy);

    // for Loop need to be in here 
               for(Node nei:node.neighbors){

                copy.neighbors.add(dfs(nei, oldToNew));
            // graphSize[i] = node.neighbors.get(i).val;
            // System.out.println(graphSize[i]);
        }
        return copy;

    }
    public Node cloneGraph(Node node) {
        
        Map<Node, Node> oldToNew = new HashMap<>();
        return dfs(node, oldToNew);
    }
}