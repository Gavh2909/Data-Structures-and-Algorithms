package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Queu {
    public static void main(String[] args) {
        Queue<Integer> qs = new LinkedList<>(List.of(23,21,34,54,100)); // this is possible
        
        System.out.println(qs);
        qs.poll();
        System.out.println(qs);  // retrives and removes first element
        qs.peek(); // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        
        qs.size(); 

        
    }
}