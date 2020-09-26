package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode040 {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {


            List<List<Integer>> res = new ArrayList<>();

            helper(res, new ArrayList<>(), candidates, target, candidates.length);



            return res;
        }

        public void helper(List<List<Integer>> res ,List<Integer> temp, int[] candidates,  int target, int loop) {

            for (int i = 0;i < loop; i++) {
                if (candidates[i] == target) {
                    temp.add(candidates[i]);
                    res.add(temp);
                } else if (candidates[i] < target) {
                    temp.add(candidates[i]);
                    candidates[i] = 0;
                    
                }
            }


        }
    }
}
