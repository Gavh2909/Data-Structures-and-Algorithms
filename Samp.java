import java.util.*;

public class Samp{

     public static void main(String []args){
        LinkedList<Integer> ls = new LinkedList<>(List.of(12, 23, 12));
        Collections.sort(ls, (a,b)-> b-a);  // this will sort the list in descending order
        // Sort the LinkedList
        // Collections.sort(ls);
        
        // Print the sorted LinkedList
        System.out.println(ls); // this will sort the list in ascending order
     }
}
