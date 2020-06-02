package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/6/1 19:53
 */
public class Main8 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int c:candies){
           max=Math.max(c,max);
        }
        for(int b:candies){
            list.add(b + extraCandies >= max);
        }
        return list;
    }
}
