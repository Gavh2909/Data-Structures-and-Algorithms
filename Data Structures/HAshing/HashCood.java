package HAshing;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HashCood {
    public static void main(String[] args) {
        
        // Hash Code: The hash code is an integer value that represents the result of the hash function. It is used to index and retrieve data in hash-based data structures.
        // which generates a hash code based on the object's memory address.
        // We can use hashCode() only for non-rimitive data structures
        
        String n="34";
        System.out.println(n.hashCode());
        
        Queue<Integer> qs = new LinkedList<>(List.of(12,23));
        System.out.println(qs.hashCode());

    }
}
