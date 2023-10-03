package Recurrsion.tree;

import java.util.Scanner;

public class BinaryTree {
    Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner sc) {
        System.out.println("Enter root value");
        int rootValue = sc.nextInt();
        root = new Node(rootValue);
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to put left for " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter left value for "+node.value);
            int leftValue = sc.nextInt();
            node.left = new Node(leftValue);
            populate(sc, node.left);
        }

        System.out.println("Do you want to put right for " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter right value for "+node.value);
            int rightValue = sc.nextInt();
            node.right = new Node(rightValue);
            populate(sc, node.right);
        }
    }

    public void display() {
        if (root == null) {
            return;
        }
        display(root, "");

    }

    public void display(Node node, String indent) {
        if(node!=null) {
            System.out.println(indent + node.value);
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
        }
    }
}
