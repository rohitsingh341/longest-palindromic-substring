package com.rohit.dsa;

public class LongestPalindromicSubstring {

    public static void main(String [] args) {
        String s1 = "cbbdabababababbabanmh";

        ApproachOneBruteForce approachOneBruteForce = new ApproachOneBruteForce();

        System.out.println("Longest palindromic substring -> " + approachOneBruteForce.getLongestPalindromicSubstr(s1));

    }
}
