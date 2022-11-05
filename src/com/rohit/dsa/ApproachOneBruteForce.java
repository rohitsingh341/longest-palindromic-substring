package com.rohit.dsa;

public class ApproachOneBruteForce {


    /** Time Complexity - O(n^3)
      * Space Complexity - O(1)
      *
      * Example input string -> "babad"
      *
     **/
    public String getLongestPalindromicSubstr(String s) {
        String resStr = "";

        for (int  i = 0; i < s.toCharArray().length; i++) {
            for (int j = i; j < s.toCharArray().length; j++) {

                boolean palindrome = isPalindrome(s, i, j);

                int len = j - i + 1;

                if (palindrome && len > resStr.length()) {
                    resStr = s.substring(i, j+1);
                }
            }
        }
        return resStr;
    }

    public boolean isPalindrome(String s1, int i, int j) {
        int leftP = i;
        int rightP = j;

        while (leftP < rightP) {
            if (s1.charAt(leftP) != s1.charAt(rightP)) {
                return false;
            }
            leftP++;
            rightP--;
        }
        return true;
    }
}