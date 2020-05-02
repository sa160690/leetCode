package in.shivamagarwal.problems;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {

    public int countElements(int[] arr) {
        Map<Integer, Integer> mem = new HashMap<>();
        for(int i=0; i< arr.length; i++) {
            if(mem.containsKey(arr[i])) {
                mem.put(arr[i], mem.get(arr[i]) + 1);
            } else {
                mem.put(arr[i], 1);
            }
        }
        int sum = 0;
        for(int key: mem.keySet()) {
            if(mem.containsKey(key + 1)) {
                sum = sum + mem.get(key);
            }
        }
        return sum;
    }
}
