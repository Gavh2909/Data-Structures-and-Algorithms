package General;

import java.util.HashMap;

public class Java11 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 4, 3, 1, 9 }; // 7
        // printNum(nums);
        String num1 = "23";
        String num2 = "23";
        System.out.println(num1.hashCode()+"::::"+num2.hashCode());

        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "Satish");
        hs.put(2, "Satish");
        System.out.println(hs.get(1).hashCode());
        System.out.println(hs.get(2).hashCode());
    }

    public static int printNum(int... nums) {
        int Max = nums[0];
        int prevmax = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (Max < nums[i]) {
                prevmax = Max;
                Max = nums[i];
            }
        }
        return prevmax;
    }
}