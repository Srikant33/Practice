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
};
*/

class Solution {
    public List<Integer> pre(Node root, List<Integer> l){
        if (root == null){
            return l;
        }
        l.add(root.val);
        for (Node n: root.children){
            l = pre(n, l);
        }
        return l;
    }
    public List<Integer> preorder(Node root) {
        List<Integer> l = new ArrayList<>();
        return pre(root, l);
    }
}