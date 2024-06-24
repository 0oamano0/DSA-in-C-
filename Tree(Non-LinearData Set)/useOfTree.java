
public class useOfTree {
    class Node{
        public int value;
        public Node left, right;

        public Node(int element){
            value=element;
            left=right=null;
        }
    }

    class Tree{
        Node root;
        Tree(){
            root=null;
        }
        void traversalPreorder(Node node){
            if(node==null){
                return;
            }
            System.out.print(node.value+" ");
            traversalPreorder(node.left);
            traversalPreorder(node.right);
        }

        void traverseInorder(Node node){
            if(node==null){
                return;
            }
            traverseInorder(node.left);
            System.out.print(node.value+" ");
            traverseInorder(node.right);
        }

        void traversalPostorder(Node node){
            if(node==null){
                return;
            }
            traversalPostorder(node.left);
            traversalPostorder(node.right);
            System.out.print(node.value+" ");
        }

        void traversalPreorder(){
            traversalPreorder(root);
        }
        void traverseInorder(){
            traverseInorder(root);
        }
        void traversalPostorder(){
            traversalPostorder(root);
        }
    }
    public static void main(String[] args) {
        useOfTree.Tree pt = new useOfTree().new Tree();
        pt.root = new useOfTree().new Node(36);
        pt.root.left = new useOfTree().new Node(26);
        pt.root.right = new useOfTree().new Node(46);
        pt.root.left.left = new useOfTree().new Node(21);
        pt.root.left.right = new useOfTree().new Node(31);
        pt.root.left.left.left = new useOfTree().new Node(11);
        pt.root.left.left.right = new useOfTree().new Node(24);
        pt.root.right.left = new useOfTree().new Node(41);
        pt.root.right.right = new useOfTree().new Node(56);
        pt.root.right.right.left = new useOfTree().new Node(51);
        pt.root.right.right.right = new useOfTree().new Node(66);

        System.out.println();
        System.out.println("The Preorder traversal of given Binary tree is - ");
        pt.traversalPreorder();
        System.out.println("\n");

        System.out.println("The Inorder traversal of given Binary tree is - ");
        pt.traverseInorder();
        System.out.println("\n");

        System.out.println("The Postorder traversal of given Binary tree is -");
        pt.traversalPostorder();




    }
    
}
