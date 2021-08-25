package programs;

public class BstFromPreOrder {
	
	int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE, preorder.length);
    }
    
    public TreeNode helper(int[] preorder, int lower, int upper, int n) {
        if (index == n) {
            return null;
        }
        int val = preorder[index];
        if (val < lower || val > upper) {
            return null;
        }
        index++;
        TreeNode root = new TreeNode(val);
        root.left = helper(preorder,lower, val, n);
        root.right = helper(preorder,val, upper, n);
        return root;
    }
	    
	    
	 
	    class TreeNode{
	    	int val;
	    	TreeNode left;
	    	TreeNode right;
	    	TreeNode(int vl){
	    		this.val=vl;
	    	}
	    	
	    	
	    }
	    

}
