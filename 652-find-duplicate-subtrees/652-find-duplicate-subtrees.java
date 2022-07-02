class Solution {
    List<TreeNode> res = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        find(root);
        return res;
    }
    
    String find(TreeNode root){
        if(root==null) return "";
        
        int cur = root.val;
        String left = find(root.left);
        String right = find(root.right);
        String temp = cur+","+left+","+right;
        
        if(map.getOrDefault(temp, 0) == 1)
            res.add(root);
        map.put(temp, map.getOrDefault(temp, 0)+1);
		
        return temp;   
    }
}