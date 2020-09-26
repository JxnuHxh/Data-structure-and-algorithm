package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode39 {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if(candidates==null || candidates.length == 0)return null;
            Arrays.sort(candidates);
            List<List<Integer>> list = new ArrayList<>();
            if(candidates[0]>target)return list;
            List<Integer> l1 = new ArrayList<>();
            int len = candidates.length -1;
            int sum = 0;
            for(int i = 0; i <= len; i++){
                while(sum <=  target){
                    sum = sum +candidates[i];
                    l1.add(candidates[i]);
                    if(sum == target)
                        list.add(l1);
                }
                if(l1.size()>2){
                    l1.remove(l1.size()-1);
                    l1.remove(l1.size()-1);
                }


            }
            return list;
        }

}
