
import java.lang.Math;

class BTree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            // Adding left side
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            }
            // Adding Right side

            else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }

    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        if (node.left == null && node.right == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int min() {

        return min(root);
    }

    private int min(Node node) {
        if (node.left == null && node.right == null) {
            return node.value;
        }
        var left = min(node.left);
        var right = min(node.right);

        return Math.min(Math.min(left, right), node.value);
    }

}

public class Main {
    public static void main(String[] args) {

        /*
         * BTree t = new BTree();
         * t.insert(4);
         * t.insert(3);
         * t.insert(4);
         * 
         * t.insert(2);
         * t.insert(9);
         * 
         * t.insert(1);
         * t.insert(7);
         * System.out.println(t.find(5));
         * System.out.println(t.height());
         * System.out.println(t.min());
         */

        BST bst = new BST();

        bst.insert(8);
        bst.insert(8);
        bst.insert(6);
        bst.insert(9);
        bst.insert(4);
        bst.insert(10);
        bst.insert(3);
        bst.insert(2);
        bst.display();
    }

}