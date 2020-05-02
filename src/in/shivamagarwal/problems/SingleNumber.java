package in.shivamagarwal.problems;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int reduceNum = nums[0];
        for(int i=1; i<nums.length; i++){
            reduceNum = reduceNum ^ nums[i];
        }
        return reduceNum;
    }
}
