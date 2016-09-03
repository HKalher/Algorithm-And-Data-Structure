package DataStructure.BinarySearchTree;

/**
 * Created by Henu on 03/09/16.
 * http://www.geeksforgeeks.org/binary-search-tree/
 */
public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree(){
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key){
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key){

        // if the tree is empty, return a new node, acts as a base case
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertRec(root.left, key);
        } else if(key > root.key){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // This method mainly calls InorderRec()
    void inorder(){
        System.out.println("Inorder Traversal");
        if (root == null){
            System.out.println("Tree is empty.");
        }else {
            inorderRec(root);
        }
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void preorder(){
        System.out.println("Preorder Traversal");
        if (root == null){
            System.out.println("Tree is empty.");
        }else {
            preorderRec(root);
        }
    }

    void preorderRec(Node root){
        if(root != null){
            System.out.println(root.key);
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder(){
        System.out.println("Postorder Traversal");
        if (root == null){
            System.out.println("Tree is empty.");
        }else {
            postorderRec(root);
        }
    }

    void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.key);
        }
    }

    Node search(Node root, int key){
        if(root == null || root.key == key){
            return root;
        }
        if(root.key > key){
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    int minValue(Node root){
        int minval = root.key;
        while (root.left != null){
            minval = root.key;
            root = root.left;
        }
        return minval;
    }

    void deleteKey(int key){
        if(root == null){
            System.out.println("Tree is empty.");
        }else {
//          root = deletekeyRec(root, key);
        }
    }

//    Node deletekeyRec(Node root, int key){
//
//        // base case
//        if(root == null){
//            return root;
//        }
//
//    }

    public static void main(String args[]){
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        binarySearchTree.inorder();    // 20, 30, 40, 50, 60, 70, 80
        binarySearchTree.preorder();    // 50, 30, 20, 40, 70, 60, 80
        binarySearchTree.postorder();    // 20, 40, 30, 60, 80, 70, 50

        System.out.println("Node is found " + binarySearchTree.search(binarySearchTree.root, 80));
    }

}
