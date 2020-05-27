package com.剑指Offer;
import java.util.HashMap;
import java.util.Map;
/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/5/27 15:34
 */
public class Problem5 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }
    public static void main(String[] args) {
        Problem5 problem5=new Problem5();
        System.out.println(problem5.lengthOfLongestSubstring("dvdf"));
    }
}
