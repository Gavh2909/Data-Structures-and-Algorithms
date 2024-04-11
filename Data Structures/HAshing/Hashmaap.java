package HAshing;

import java.util.HashMap;
class HashMaap{
    public static void main(String[] args){
        HashMap<Integer, Integer> hm = new HashMap<>();

        // adding values
        hm.put(1, 1);
        hm.put(1, 2);  // the value for key 1 will be updated here
        
        
        System.out.println(hm.entrySet());
    }
}