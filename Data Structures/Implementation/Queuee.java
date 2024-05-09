package Implementation;

public class Queuee {
    private Node front;
    private Node rear;
    private int size;

    public Queuee() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            front =  newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        int removedData = front.data;
        front =  front.next;

        if(front == null) {
            rear = null;
        }

        size--;
        return removedData;
    }
    public int peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is emptyu");
        }
        return front.data;
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }
}
