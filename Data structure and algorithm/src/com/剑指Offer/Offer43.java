package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/21 22:33
 */
public class Offer43 {
        public int countDigitOne(int n) {
            int res = 0;
            for (long m = 1; m <= n; m *= 10) {
                long a = n / m;
                long b = n % m;
                res += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
            }
            return res;
        }

}
