import java.util.LinkedList;
import java.util.List;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();

        // methods
        ls.add(12); // adds the element at the end of the list

        ls.add(0, 9); // adds the element at specified index

        // appending another Linked list or collection with same data type 
        LinkedList<Integer> ls1=new LinkedList<>(List.of(12,12,12));
        ls.addAll(ls1);

        // List.of() fucntion - The List.of() function in Java is used to create an immutable (unchangeable) list containing the specified elements. It was introduced in Java 9 as part of the Java Collections framework.
        
        ls.addFirst(15);// adds the new alement at beginning of the list

        ls.addLast(56); // adds the new alement at end of the list

        ls.contains(12);  // returns true if the list contains a specified element

       boolean isContains = ls.containsAll(new LinkedList<>(List.of(12,56))); 
       System.out.println(isContains);

       int head = ls.element(); // retrieves the head of the list, does not remove it
       System.out.println(head);

       ls.get(1) ;// gets the element at a specified index

       ls.getFirst(); // gets the first element of the list

       ls.getLast(); // gets the last element of the list

       ls.indexOf(56); // returns index of the first occurances of the value or -1 if the element is not present

       ls.isEmpty(); // returns true if the list is empty

       ls.lastIndexOf(56); // if there are two similiar values then this function returns the last index of the value   

       ls.peek(); // retieves first element ,of the list but does not remove it
       ls.peekFirst();
       ls.peekLast();

       ls.poll(); // retrives and removes the first element of the list
       ls.pollFirst();
       ls.pollLast();

       ls.remove(); // removes the head of the list
       ls.remove(1); // removes the element at specified index
       ls.remove(56); // remves the first occurance of the list elemnt from the lisy

       // Sorts - to sort the linked listy we can use Collections.sort method

       ls.subList(1, 3); // creates a sublist from to specified index

       ls.toArray(); // converts the list into array

       int size = ls.size();
    }
}
