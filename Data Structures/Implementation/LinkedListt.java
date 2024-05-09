package Implementation;

public class LinkedListt {

    Node head;

    LinkedListt() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(int n) {
        if (head == null) {
            head = new Node(n);
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(n);
        }
    }

    int size() {
        int n = 0;
        Node curr = head;
        while (curr != null) {
            n++;
            curr=curr.next;
        }
        return n;
    }

    boolean contains(int key) {
        Node temp = head;

        while (temp != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void display() {
       Node temp = head;
       while (temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
       System.out.println();
    }

    void delete(int key) {
        Node prev = null;
        Node current = head;

        // Traverse the list to find the node with the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        //IF the key was not found
        if (current == null) {
            return;
        }

        // IF teh node to be deleted is head
        if(prev == null) {
            head = head.next;
        }else{
            prev.next= current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.display();
        ll.delete(13);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains(15));
        System.out.println(ll.contains(176));

    }
}
