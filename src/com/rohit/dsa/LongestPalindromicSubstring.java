package com.rohit.dsa;

public class LongestPalindromicSubstring {

    public static void main(String [] args) {
        String s1 = "cbbd";

        //ApproachOneBruteForce approachOneBruteForce = new ApproachOneBruteForce();
        ApproachTwoExpandingAroundCenter approachTwoExpandingAroundCenter = new ApproachTwoExpandingAroundCenter();

        System.out.println("Longest palindromic substring -> " + ApproachTwoExpandingAroundCenter.getLongestPalindromicSubstr(s1));

    }
}
