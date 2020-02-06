package com.zijietiaodong.h1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/6 17:43
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c))
            {
                return new int[] {map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
