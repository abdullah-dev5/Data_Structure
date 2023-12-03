import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePractise {

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // height
    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);
        int ans = Math.max(left, right) + 1;
        return ans;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        // to enter value at leaf or make root node.
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (node.value > value) {
            node.left = insert(node.left, value);
        }

        if (node.value < value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Searching with recursions
    Boolean searchRec(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (node.value == value) {

            return true;
        }

        if (node.value > value) {

            return searchRec(node.left, value);
        }

        return searchRec(node.right, value);
    }

    // Searching iterative way
    Boolean search(int value) {
        Node temp = root;
        if (temp == null) {
            return false;
        }
        while (temp != null) {

            if (temp.value == value) {
                return true;
            }
            if (temp.value > value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return false;
    }

    // Inorder Traversal
    void inorderTraversal(Node node) {

        if (node == null) {

            return;

        }
        inorderTraversal(node.left);
        System.out.println(node.value + " -> ");
        inorderTraversal(node.right);
    }

    //
    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return node;
        }

        else if (node.value > value) {
            node.left = delete(node.left, value);
            return node;
        }

   else  if (node.value < value) {
            node.right = delete(node.right, value);
            return node;
        }

        if(node.value ==  value)
        {
            // 0 child 

                if (node.left ==  null && node.right == null) {
                    
                    node = null;
                }
                else if (root.right != null ) {
                    
                }

            // 1 child 
            
            // 2 childs


        /*         if (node.left == null) {
            Node temp = node.right;
            return temp;
        } else if (node.right == null) {

            Node temp = node.right;
            return temp;
        }

        // both childern exist
        else {
            Node replacer = node;

            Node temp = node.right;

            while (temp.left != null) {
                replacer = temp;
                temp = temp.left;
            }

            // Uncomplete code G4G

        }*/
        }











        return node;
    }

    void levelOrderTraversal(Node node) {
        Queue<Node> queue = new LinkedList();

        queue.add(node);
        queue.add(null);

        while (!queue.isEmpty()) {

            Node temp = queue.peek();
            queue.remove();

            if (temp == null) {
                // when a level completed then start from nextline.

                System.out.println();

                if (!queue.isEmpty()) {
                    queue.add(null);
                }

            } else {
                System.out.print(temp.value + " ");

                if (temp.left != null) {

                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

        }

    }

}
