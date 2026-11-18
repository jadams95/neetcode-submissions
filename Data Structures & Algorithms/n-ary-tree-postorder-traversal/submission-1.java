/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Node cur = root, cameFrom = null;
        while (true) {
            List<Node> kids = cur.children;
            // Every node except root has a temporary parent thread appended at the end
            int real = (cur == root) ? kids.size() : kids.size() - 1;
            // Resume after the child we just came back from (or start at 0 going down)
            int next = (cameFrom == null) ? 0 : kids.indexOf(cameFrom) + 1;

            if (next < real) {                    // unvisited child: thread it, go down
                Node child = kids.get(next);
                child.children.add(cur);          // thread: child -> parent
                cameFrom = null;
                cur = child;
            } else {                              // all children done: visit, go up
                res.add(cur.val);
                if (cur == root) break;
                Node parent = kids.remove(kids.size() - 1);  // remove thread, restore tree
                cameFrom = cur;
                cur = parent;
            }
        }
        return res;
    }
}