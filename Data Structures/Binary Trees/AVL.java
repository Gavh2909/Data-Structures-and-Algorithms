import java.util.Scanner;

public class AVL {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

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

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node == null) return;
        System.out.println(details+ node.getValue());

        display(node.left, "left child of "+node.getValue()+" : ");
        display(node.right, "right child of "+node.getValue()+" : ");
    }

    public void populate(Scanner scanner) {
        System.out.print("Enter the root Node value: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left); // whatever thing you are inserting should be set as left or right
                                                  // child of your parent node
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(node.left.height, node.right.height) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            // left heavy

            if(height(node.left.left)- height(node.right.right) > 0){
                // left left case
                return rightRotate(node);
            }
            if(height(node.left.left)- height(node.right.right) < 0){
                // left Right case -  left rotate on child
                node.left =  leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left)-height(node.right)< -1){
            // Right heavy

            if(height(node.right.left)- height(node.right.right) < 0){
                // right right case
                return leftRotate(node);
            }
            if(height(node.right.left)- height(node.right.right) > 0){
                // right left case -  left rotate on child
                node.right =  rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // left and Right rotate
    private Node rightRotate(Node p){
          Node c = p.left;
          Node t = c.right;

          c.right = p;
          p.left = t;

          p.height = Math.max(height(p.left), height(p.right)+1);
          c.height = Math.max(height(c.left), height(c.right)+1);

          return c;
    }

    // left Rotate

    private Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);


        return c;
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of left of " + node.value);
            int value = scanner.nextInt();

            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter Right of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = scanner.nextInt();

            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

}
