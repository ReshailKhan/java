package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Tasks {
    public int[] twoSum(int[] nums, int target) {
        //Vector<Integer> result = new Vector<>();
        for(int i = 0; i<nums.length-1;i++){
            for (int j = 1; j<nums.length;j++){
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
}
