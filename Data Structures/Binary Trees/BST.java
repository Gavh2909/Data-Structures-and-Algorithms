public class BST {
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

    public BST() {

    }

    public int height(Node node) {
        if (node == null)
            return -1;
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
        if (value < node.value) {
            node.left = insert(value, node.left); // whatever thing you are inserting should be set as left or right
                                                  // child of your parent node
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(node.left.height, node.right.height) + 1;
        return node;
    }

    // Insert multiple items

    public void populate(int[] nums){
        for(int i: nums){
            Node nd =this.insert(i, root);
            System.out.println(nd.value+" inserted");
        }
    }

    // populate for sorted array
    public void populateSorted(int[] nums){
        // populateSorted(nums, nums.length);
    }

    public void populateSorted(int[] nums, int start, int end){
        if(start<end){
            return;
        }

        int mid =(start+end)/2;
        this.insert(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null) return true;

      return  Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right) ;
    }

    public void display(){
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details){
        System.out.println("Printing started");
        if(node == null) {
            return ;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of "+node.value + " : " );
        display(node.right, "right child of "+node.value + " : " );
    }
}
