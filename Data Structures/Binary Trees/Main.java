public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {23,2,1,6,76,34,1,12};
        tree.populate(nums);
        tree.display();
    }
}
