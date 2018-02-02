package com.ithink.learn.algorithm.other;

/**
 * 求两个数的最大公因数
 * 在两次迭代后，余数最多是原始值的一半，迭代次数最多是2logN=O(logN)
 */
public class GCD {

    public static long gcd(long m, long n) {
        while (n != 0) {
            long rem = m % n;
            m = n;
            n = rem;
        }

        return m;
    }

    public static void main(String[] args) {
        System.out.println(gcd(75, 18));
    }
}
