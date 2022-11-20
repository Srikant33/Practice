/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null ){
            sb.append("null");
            sb.append(",");
            return sb.toString();
        }
        sb.append(root.val);
        sb.append(",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // System.out.println(data);
        
        String[] s = data.split(",");
        
        if (s[0].equals("null") || data.length() == 0 ){
            return null;
        }
        else {
            int val = Integer.parseInt(s[0]);
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            
            boolean rightside = false;
            for (int i=1 ; i<s.length; i++){
                if (!s[i].equals("null") && Integer.parseInt(s[i])>val ){
                    rightside = true;
                }
                if (!rightside){
                    left.append(s[i]);
                    left.append(",");
                }
                else {
                    right.append(s[i]);
                    right.append(",");
                }
            }
            TreeNode curr = new TreeNode(val); 
            curr.left= deserialize(left.toString());
            curr.right= deserialize(right.toString());
            
            return curr;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;