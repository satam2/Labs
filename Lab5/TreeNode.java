public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }
    
    TreeNode(int val) {
    	this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public boolean isValidBST(TreeNode root) {
    	return isValidBSTHelper(root,null,null);
    }
    
    private boolean isValidBSTHelper(TreeNode n, Integer l, Integer u) {
    	// check and set upper and lower bound at each particular node
    	if(n==null)
    		return true;
    	if(l!=null&&n.val<=l)
    		return false;
    	if(u!=null&&n.val>=u)
    		return false;
    	if(!isValidBSTHelper(n.right, n.val, u))
            return false;
        if (!isValidBSTHelper(n.left, l, n.val))
            return false;
        
        return true;

    }
    
    // testing
    public static void main(String[] args) {
    	TreeNode n1 = new TreeNode(1);
    	TreeNode n2 = new TreeNode(2);
    	TreeNode n9 = new TreeNode(9);
    	TreeNode n3 = new TreeNode(3,n1,null);
    	TreeNode n8 = new TreeNode(8,n2,n9);
    	TreeNode n4 = new TreeNode(4,n3,n8);
    	
    	System.out.println(n4.isValidBST(n4)+""); // false
    	
    	TreeNode n5 = new TreeNode(5);
    	TreeNode n7 = new TreeNode(7);
    	TreeNode n6 = new TreeNode(6, n5,n7);
    	System.out.println(n6.isValidBST(n6)+""); // true
    	
    }
}

