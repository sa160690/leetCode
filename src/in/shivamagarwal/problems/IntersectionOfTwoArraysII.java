package in.shivamagarwal.problems;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
        System.out.println(intersect(num1, num2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j])j++;

        }
        int[] ret = new int[result.size()];
        for(int k = 0;k < ret.length;k++)
            ret[k] = result.get(k);
        return ret;
    }
}
