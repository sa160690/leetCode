package in.shivamagarwal.problems;

import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;

public class HappyNumber {

    private HashSet<Integer> memHappy = new HashSet<>();

    public boolean isHappy(int n) {
        HashSet mem = new HashSet();
        if(memHappy.contains(n)) {
            return true;
        } else {
            while(!mem.contains(n)) {
                mem.add(n);
                n = getSumOfSquaresOfDigits(n);
                if(n == 1) {
                    memHappy.addAll(mem);
                    return true;
                }
            }
        }
        return false;
    }

    public int getSumOfSquaresOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum = sum + ((n % 10) * (n % 10));
            n = n /10;
        }
        return sum;
    }
}
