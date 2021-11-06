package com.company;
import java.lang.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Testing {

    public static void main(String[] args){
        int[] inputArr = {1,2,4,4,3,3,0,9,2,3};
        System.out.println(findPairs(inputArr, 3));
    }
    public static int findPairs(int[] nums, int k) {
        int result = 0;
        int inputSize = nums.length;
        Map<Integer, Set<Integer>> uniqueKeysTracker = new HashMap<>();
        for(int i=0; i< inputSize-1; i++){
            for(int j=i+1; j< inputSize; j++){
                Set<Integer> setValues = uniqueKeysTracker.get(nums[i]);
                if(Math.abs(nums[i]-nums[j])==k && (setValues==null || !setValues.contains(nums[j]))){
                    if(setValues==null){
                        setValues = new HashSet<>();
                    }
                    setValues.add(nums[j]);
                    uniqueKeysTracker.put(nums[i],setValues);
                    result++;
                }
            }
        }
        return result;
    }
}
