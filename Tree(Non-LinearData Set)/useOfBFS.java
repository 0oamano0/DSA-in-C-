class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val =x;
        left =null;
        right = null;
    }
}

public class BinaryTreeLevelOrder{
    TreeNode root;
    public void insert(int value){
        TreeNode newNode= new TreeNode(value);
        if(root==null){
            root=newNode;
        }else{
            inserRec(root,newNode);
        }
    }

    private void inserRec(TreeNode root,TreeNode newNode){
        int h=height(root);
        for(int i=1;i<=h;i++){
            if(insertAtLevel(root,newNode,i)){
                break;
            }
        }
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int leftHeight=height(root.left);
            int rightheight=height(root.right);
            return Math.max(leftHeight,rightheight)+1;
        }
    }
    
    private boolean insertAtLevel(TreeNode root,TreeNode newNode,int level){
        if(root ==null){
            return false;
        }
        if(level ==1){
            if(root.left==null){
                root.left =newNode;
                return true;
            }else if(root.right==null){
                root.right=newNode;
                return true;
            }else{
                return false;
            }
        }else if(level >1){
            //! continue ...
        }
    }
}
public class useOfBFS {
    public static void main(String[] args) {
        
    }
    
}
