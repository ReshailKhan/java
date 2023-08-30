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
        System.out.println("consecutiveVowels: " + tasks.consecutiveVowels("aaboaeissstraeiou"));
        System.out.println("lengthOfLongestSubstring: " + tasks.lengthOfLongestSubstring("abcabcbb"));
        int[] num1 = new int[2];
        num1[0] = 1;
        num1[1] = 3;
//        num1[2] = 2;
//        num1[3] = 3;
        int[] num2 = new int[5];
        num2[0] = 7;
        num2[1] = 6;
        num2[2] = 6;
        num2[3] = 7;

        num2[4] = 8;
        System.out.println("findMedianSortedArrays: " + tasks.findMedianSortedArrays(num1,num2));

        //System.out.println("abcabcbb reverseString: " + tasks.reverseString("abcabcbb"));
        //System.out.println("longestPalindrome: " + tasks.longestPalindrome("cbbd"));
        //System.out.println("longestPalindrome: " + tasks.longestPalindrome("ccc"));
        System.out.println("longestPalindrome: " + tasks.longestPalindrome("bacabab"));
        System.out.println("findNonRepeatedNumber: " + tasks.findNonRepeatedNumber(num2));

    }


}
