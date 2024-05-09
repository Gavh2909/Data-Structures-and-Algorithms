package InterviewQuestions;

import java.util.ArrayList;

public class Varargs {
    public static void main(String[] args) {
        String[] names = { "Swetha", "Satish", "Aman", "Piyush" };
        Integer[] legths = getLengths(names);

        for (int len : legths) {
            System.out.print(len + " ");
        }
    }

    public static Integer[] getLengths(String... names) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (String name : names) {
            arr.add(name.length());
        }
        Integer[] integerArray = arr.toArray(new Integer[arr.size()]);
        return integerArray;
    }
}
