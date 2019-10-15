package com.hxh.likou;

import java.util.HashMap;
import java.util.Set;

public class Kdiff {

        public int findPairs(int[] nums, int k) {
            //nums为空，长度小于2，或者k小于0等都视为非法，直接返回0
            if(nums==null || nums.length<2 || k<0)
                return 0;
            //HashMap来记录数组中的值，value为值出现的次数
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int num : nums)
            {
                hm.put(num, hm.getOrDefault(num, 0)+1);
            }
            int count = 0;
            Set<Integer> set = hm.keySet();
            for(int key : set)
            {
                int sub = k+key;
                if(sub == key)
                    //若果k为0，则判断hm.get(key)值得大小，如果大于2，则表示存在一个数对
                    //否则表示该数对不存在
                    count += (hm.get(key)>=2?1:0);
                    //如果sub不等于key,且存在sub键，则count加1
                else if(hm.containsKey(sub))
                {
                    count += 1;
                }
            }
            return count;
        }

}
