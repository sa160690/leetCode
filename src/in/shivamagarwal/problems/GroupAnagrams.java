package in.shivamagarwal.problems;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mem = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i=0; i<strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            if(mem.containsKey(String.valueOf(arr))) {
                mem.get(String.valueOf(arr)).add(strs[i]);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                mem.put(String.valueOf(arr), tempList);
            }
        }
        for(String key: mem.keySet()) {
            result.add(mem.get(key));
        }
        return result;
    }
}
