package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 11;
        array[2] = 7;
        array[3] = 15;

        System.out.println("twoSum: " + Arrays.toString(tasks.twoSum(array,9)));
    }
}
