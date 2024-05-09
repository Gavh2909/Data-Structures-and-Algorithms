package Implementation;

import java.util.Stack;

public class Stackk {

    Node top;

    Stackk() {
        this.top = null;
    }

    void add(int n) {
        Node temp = top;
        top = new Node(n);
        top.next = temp;
    }

    void pop() {
        if (top == null)
            return;
        top = top.next;
    }

    public int peek() throws NullPointerException {
        if (top == null)
            return -1;
        return top.data;
    }

    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public boolean contains(int key) {
        Node temp = top;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();

        // [][][][][][]
        Stackk st = new Stackk();
        st.add(12);
        st.add(13);
        st.add(15);
        st.display();

        st.pop();
        st.add(154);
        st.display();
        System.out.println(st.size());
        System.out.println(st.contains(154));
        System.out.println(st.peek());

    }
}
