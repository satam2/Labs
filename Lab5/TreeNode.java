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
    
    // check and set upper and lower bound at each particular node
    public boolean isValidBST(TreeNode root) {
    	int min = root.val;
    	int max = root.val;
    	
    	if(root.val > max || root.val < min)
    		return false;
    	
    	if(root.left.val < max) {
    		max = root.left.val;
    		return isValidBST(root.left);
    	}
    	else if(root.right.val>min) {
    		min = root.right.val;
    	}
    		return false;
    }
    
    public static void main(String[] args) {
    	TreeNode n1 = new TreeNode(1);
    	TreeNode n2 = new TreeNode(2);
    	TreeNode n9 = new TreeNode(9);
    	TreeNode n3 = new TreeNode(3,n1,null);
    	TreeNode n8 = new TreeNode(3,n2,n9);
    	TreeNode n4 = new TreeNode(3,n3,n8);
    	
    	System.out.println(n4.isValidBST(n4)+"");
    	
    }
}

