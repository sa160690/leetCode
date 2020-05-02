package in.shivamagarwal.May2020LeetCodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String j, String s) {
        Set<Character> jewelSet = new HashSet<>();
        for(int i=0; i< j.length(); i++) {
            jewelSet.add(j.charAt(i));
        }

        int jewelCount = 0;
        for(int i=0; i< s.length(); i++) {
            if(jewelSet.contains(s.charAt(i))) {
                jewelCount++;
            }
        }
        return jewelCount;
    }
}
