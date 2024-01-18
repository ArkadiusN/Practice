package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }


    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int max = 0;
        for (Integer c: map.values()) {
            if(c > max){
                max = c;
            }
        }

        int h = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == max) {
                h = entry.getKey();
                break;
            }
        }
        if(max > n/2){
            return h;
        }
        return -1;
    }
}
