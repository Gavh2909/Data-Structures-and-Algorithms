package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLis {
    enum DAY {S,M,T, W, F, SD};
    public static void main(String[] args) {
        
        System.out.println(DAY.values().length);
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(12);
        aList.add(10);
        aList.add(106);
        aList.add(13);
        aList.add(19);
        Collections.sort(aList);
        System.out.println(aList);
    }
}
