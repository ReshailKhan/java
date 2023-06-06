package leetcode;

import java.util.*;

public class Tasks {
    public int[] twoSum(int[] nums, int target) {
        //Vector<Integer> result = new Vector<>();
        for(int i = 0; i<nums.length-1;i++){
            for (int j = i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public int[] twoSumWithOutComplexity(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                return new int[] {map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }
        return new int[] {};
    }

    public int consecutiveVowels(String str) {
        char[] chars = str.toCharArray();
        int count  = 0;
        int res = 0;

        for (int i = 0; i < chars.length; i++){
            if (isVowel(chars[i]))
                count++;
            else {
                res = Math.max(count, res);
                count = 0;
            }
        }
        return Math.max(count,res);
    }

    private boolean isVowel(char cha){
        return  (cha == 'a' || cha == 'e' || cha == 'i'
                || cha == 'o' || cha == 'u');
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int count  = 0;
        int res = 0;
        int i = -1;
        Set<Character> set = new HashSet<> ();
        for (int j = 0; j < chars.length; j++){
            if (!set.contains(chars[j])){
                set.add(chars[j]);
                count++;
            }
            else {
                set = new HashSet<> ();
                res = Math.max(count, res);
                count = 0;
                i++;
                j = i;
            }
        }
        return Math.max(count,res);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int length = num1Length+num2Length;
        int div = length%2;
        int medianIndex = length/2;
        int[] totalNumber = new int[length];
        for (int i = 0;i<length;i++){
            if(i<num1Length){
                totalNumber[i] = nums1[i];
            }else {
                totalNumber[i] = nums2[i-num1Length];
            }
        }
        Arrays.sort(totalNumber);
        if (div==0){
            ans = (totalNumber[medianIndex-1]+totalNumber[medianIndex])/2.0;
        }else {
            ans = totalNumber[medianIndex];
        }
        return ans;
    }
}
