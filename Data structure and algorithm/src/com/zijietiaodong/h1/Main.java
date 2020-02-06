package com.zijietiaodong.h1;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/6 17:57
 */
public class Main {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] nums={2, 7, 11, 15};
        int[] n=s.twoSum( nums, 9);
        System.out.println(n[0]+" "+n[1]);
    }
}
