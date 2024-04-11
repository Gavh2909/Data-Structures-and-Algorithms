package HAshing;

import java.util.Hashtable;

public class HashTabble {
    public static void main(String[] args) {
        // A Hashtable in Java is a data structure that stores key-value pairs. It is similar to HashMap but is synchronized, meaning it is thread-safe. This synchronization comes with a performance cost compared to HashMap

        Hashtable<Integer, String> hsTable =  new Hashtable<>();
        hsTable.put(1,"One");
        hsTable.put(1,"Two"); // this will update the value of key 1 but does not create new row
        hsTable.put(2, "three");
        hsTable.put(3, "Six");
        hsTable.put(4, "Four");

        System.out.println(hsTable.entrySet());
    }
}

/**
 * 1 - Two
 * 
 */