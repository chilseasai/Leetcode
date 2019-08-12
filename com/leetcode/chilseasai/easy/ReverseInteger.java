package com.leetcode.chilseasai.easy;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        long tmp = 0;
        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            x /= 10;
        }

        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) tmp;
        }
    }

    public static void main(String[] args) {
        int reverseNum = new ReverseInteger().reverse(-2147483648);
        System.out.println(reverseNum);
    }
}
