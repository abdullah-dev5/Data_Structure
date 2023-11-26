public class AVL {
        public class Node {
            private int value;
            private Node left;
            private Node right;
            private int height;
    
            public Node(int value) {
                this.value = value;
            }
    
            public int getValue() {
                return value;
            }
        }
    
        private Node root;
    
        public AVL() {
    
        }
    
        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }
    
        public boolean isEmpty() {
            return root == null;
        }
    
        public void insert(int value) {
            root = insert(value, root);
        }
    
        private Node insert(int value, Node node) {
            if (node == null) {
                node = new Node(value);
                return node;
            }
            // traversing the tree . it will assign the same value as a node have.
            if (value < node.value) {
                node.left = insert(value, node.left);
            }
    
            if (value > node.value) {
                node.right = insert(value, node.right);
            }
    
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return rotate(node);
        }

         private  Node rotate(Node node)
            {   
                if (height(node.left)-height(node.right) > 1 ) {
                    //left heavy 
                    if (height(node.left.left  )-height(node.left.right) > 0) {
                        
                        // left left case
                        return rightRotate(node);
                    }
                    
                    if (height(node.left.left  )-height(node.left.right) < 0) {
                        
                        // left Right case
                        node.left = leftRotate(node.left);
                        return rightRotate(node);
                    }
                }
                
                if (height(node.left)-height(node.right) < -1 ) {
                    //Right heavy 
                    if (height(node.right.left  )-height(node.right.right) < 0) {
                        
                        // Right Right case
                        return leftRotate(node);
                    }
                    
                    if (height(node.right.left  )-height(node.right.right) > 0) {
                        
                        // Right Left case
                        node.right = rightRotate(node.right);
                        return leftRotate(node);
                    }
                }

                return node;
            }

             private Node leftRotate(Node c)
             {


                Node p= c.right;
                Node t = p.left;
                p.left = c;
                c.right = t;

                p.height = Math.max(height(p.left),height(p.right)+1);
                c.height = Math.max(height(c.left),height(c.right)+1);
                

             
                return p;
             }

             private Node rightRotate(Node p)

             {



                Node c= p.left;
                Node t = c.right;
                c.right = p;
                p.left = t;

                p.height = Math.max(height(p.left),height(p.right)+1);
                c.height = Math.max(height(c.left),height(c.right)+1);
                

                return c;
             }




    
        public boolean isBalanced() {
            return isBalanced(root);
        }
    
        private boolean isBalanced(Node node) {
            if (node == null) {
                return true;
            }
            return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
        }
    
        public void display() {
            display(this.root, "Root Node: ");
        }
    
        private void display(Node node, String details) {
            if (node == null) {
                return;
            }
            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + " : ");
            display(node.right, "Right child of " + node.value + " : ");
        }
    
    }    
