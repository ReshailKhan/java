package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 5;
        array[2] = 5;
        array[3] = 11;

        System.out.println("twoSum: " + Arrays.toString(tasks.twoSum(array,10)));
        System.out.println("twoSumWithOutComplexity: " + Arrays.toString(tasks.twoSumWithOutComplexity(array,9)));
    }
}
