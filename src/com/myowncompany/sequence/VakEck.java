package com.company.sequence;

import java.util.HashMap;
import java.util.Map;

public class VakEck {
    public static void main(String[] args){
        int [] arr = new int[100];

        Map<Integer, Integer> indexMap = new HashMap<>();

        int c = 100;
        int nextValue = 0;
        int currentValue = 0;
        System.out.print(currentValue) ;
        for(int i=0; i<99; i++){
//            indexMap.put(nextValue, i);

            if(indexMap.containsKey(currentValue)){
                nextValue = (i - indexMap.get(nextValue));
            }
            else {
                nextValue = 0;
            }
            indexMap.put(currentValue, i);
            System.out.print(","+nextValue );
            currentValue = nextValue;

        }

    }
}
