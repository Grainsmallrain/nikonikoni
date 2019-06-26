public class leetcode0626_2{
	private static int last=Integer.MIN_VALUE;
	static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public static boolean isValidBST(TreeNode root) {
    	if(root==null)
    		return true;
    	if(isValidBST(root.left))
    	{
    		if(last<root.val)
    		{
    			last=root.val;
    			return isValidBST(root.right);
    		}

    	}
    	return false;
        
    }
	public static void main(String args[]) {
		TreeNode root=new TreeNode(0);
		boolean result=isValidBST(root);
	}
}