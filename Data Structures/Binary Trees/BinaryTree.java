import java.util.Scanner;

class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        private int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // insert elements
    public void populate(Scanner scanner) {
        System.out.print("Enter the root Node value: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
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

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){

        if(node==null) return;
        System.out.print(indent+ node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }
}