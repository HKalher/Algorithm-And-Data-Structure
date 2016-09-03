//package DataStructure.BinarySearchTree;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//
///**
// * Created by Kumar on 2/9/2016.
// */
//class BSTNode{
//    BSTNode left, right;
//    int data;
//
//    public BSTNode(){   // default constructor, to initialize the root node
//        left=null;
//        right=null;
//        data=0;
//    }
//    public BSTNode(int value){  // parameterized constructor
//        data=value;
//        left=null;
//        right=null;
//    }
//    public void setLeft(BSTNode leftNode){  // function to set left node
//        left=leftNode;
//    }
//    public void setRight(BSTNode rightNode){    // function to set right node
//        right=rightNode;
//    }
//    public BSTNode getLeft(){   // function to get left node
//        return left;
//    }
//    public BSTNode getRight(){  // function to get right node
//        return right;
//    }
//    public void setData(int value){ // function to set data to a node
//        data=value;
//    }
//    public int getData(){   // function to get data of a given node
//        return data;
//    }
//}
//class BST{
//    private BSTNode root;   // create a root node
//    public BST(){
//        root=null;
//    }
//    public boolean isEmpty(){
//        return root==null;
//    }
//    public void insert(int data){   // function to add data to the tree, it calls the BSTNode method
//        root=insert(root,data);
//    }
//    public BSTNode insert(BSTNode node, int data){  // recursive function to add data
//        if(node==null){
//            node=new BSTNode(data);
//        }else {
//            if(data<=node.getData()){
//                node.left=insert(node.left, data);
//            }else {
//                node.right=insert(node.right, data);
//            }
//        }
//        return node;
//    }
//    public void delete(int data){
//        if(isEmpty()){
//            System.out.println("There is no node to delete");
//        }else if(search(data)==false){
//            System.out.println(data + " is not present");
//        }else {
//            root=delete(root,data);
//            System.out.println(data + "has been deleted");
//        }
//    }
//    public BSTNode delete(BSTNode root, int data){
//
//    }
//}
//public class BinarySearchTree1 {
//
//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter output = new PrintWriter(System.out);
//        output.flush();
//    }
//}
