package Sword;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class No26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        TreeNode head = FindMinOne(pRootOfTree);
        if(pRootOfTree.left!=null){
            if(pRootOfTree.left.left==null&&pRootOfTree.left.right==null){
                pRootOfTree.left.right = pRootOfTree;
            }else{
                FindMaxOne(pRootOfTree.left).right = pRootOfTree;
                pRootOfTree.left = FindMaxOne(pRootOfTree.left);
            }
        }
        if(pRootOfTree.right!=null){
            if(pRootOfTree.right.left==null&&pRootOfTree.right.right==null){
                pRootOfTree.right.left = pRootOfTree;
            }else{
                FindMinOne(pRootOfTree.right).left = pRootOfTree;
                pRootOfTree.right = FindMinOne(pRootOfTree.right);
            }
        }
        /*if(pRootOfTree.left.right==null){
            pRootOfTree.left.right = pRootOfTree;
        }else{
            pRootOfTree.left = FindMaxOne(pRootOfTree.left);
        }
        if(pRootOfTree.right.left == null){
            pRootOfTree.right.left = pRootOfTree;
        }else{
            pRootOfTree.right = FindMinOne(pRootOfTree.right);
        }
        pRootOfTree.left = FindMaxOne(pRootOfTree.left);
        pRootOfTree.right = FindMinOne(pRootOfTree.right);*/
        Convert(pRootOfTree.left);
        Convert(pRootOfTree.right);
        return head;
    }
    public TreeNode FindMaxOne(TreeNode root){
        TreeNode MaxOne;
        if(root==null){
            return null;
        }
        MaxOne = root;
        while(root.right!=null){
            MaxOne = root.right;
        }
        return MaxOne;
    }
    public TreeNode FindMinOne(TreeNode root){
        TreeNode MinOne;
        if(root==null){
            return null;
        }
        MinOne = root;
        while(root.left!=null){
            MinOne = root.left;
        }
        return MinOne;
    }
}
