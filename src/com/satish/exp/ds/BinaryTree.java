package com.satish.exp.ds;

public class BinaryTree {
     private static class Node{
         private int data;
         private Node left, right;

         public Node(int data) {this.data=data;};
         public Node(int data, Node left, Node right) {
             this.data = data;
             this.left = left;
             this.right = right;
         }
     }

     private Node root;
     private static int height;
     private static int findNodeDepth(Node node, int data){

        if(node == null) return -1;

        int dist = -1;
        if(node.data == data || (dist = findNodeDepth(node.left, data)) >= 0 ||
                (dist = findNodeDepth(node.right, data)) >= 0)
            return (dist+1);

        return dist;

     }

    private static int findHeightUtil(Node root, int x)
    {
        if (root == null) return -1;

        int leftHeight = findHeightUtil(root.left, x);
        int rightHeight = findHeightUtil(root.right, x);

        int ans = Math.max(leftHeight, rightHeight) + 1;

        if (root.data == x) System.out.printf("hieght is: " + ans);

        return ans;
    }

    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.left.right.right = new Node(45);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        int k = 15;

        System.out.println("Depth: " + findNodeDepth(root, k));
        findHeightUtil(root, 10);
    }
}
