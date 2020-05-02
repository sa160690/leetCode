package in.shivamagarwal.problems;

import java.util.Arrays;

public class MoveZero {

    public void moveZeroes(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                int c = 1;
                for(int j=i; j<nums.length; j++) {
                    if(nums[j] != 0) {
                        c = j -i;
                        break;
                    }
                }
                for(int j=i; j<nums.length; j++) {
                    if(j < nums.length - c) {
                        nums[j] = nums[j+c];
                    } else {
                        nums[j] = 0;
                    }
                }
            }
        }
    }
}
