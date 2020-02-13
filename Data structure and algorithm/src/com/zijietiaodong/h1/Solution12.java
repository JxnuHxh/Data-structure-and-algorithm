package com.zijietiaodong.h1;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/14 1:41
 * 135分糖果
 */
public class Solution12 {
        public int candy(int[] ratings) {
            int sum = 0;
            int[] left2right = new int[ratings.length];
            int[] right2left = new int[ratings.length];
            Arrays.fill(left2right, 1);//用1填充数组
            Arrays.fill(right2left, 1);
            for (int i = 1; i < ratings.length; i++) {
                if (ratings[i] > ratings[i - 1]) {
                    left2right[i] = left2right[i - 1] + 1;
                }
            }
            for (int i = ratings.length - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1]) {
                    right2left[i] = right2left[i + 1] + 1;
                }
            }
            for (int i = 0; i < ratings.length; i++) {
                sum += Math.max(left2right[i], right2left[i]);
            }
            return sum;
        }
    }

