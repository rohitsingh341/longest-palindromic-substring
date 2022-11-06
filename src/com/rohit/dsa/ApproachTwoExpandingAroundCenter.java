package com.rohit.dsa;

public class ApproachTwoExpandingAroundCenter {

    /** Time Complexity - O(n^2)
     * Space Complexity - O(1)
     *
     * Example input string -> "babad"
     *
     **/
    public static String getLongestPalindromicSubstr(String s) {
        String resStr = "";
        int resStrLen = 0;

        for (int i = 0; i < s.length(); i++) {
            //Odd case
            int leftP = i;
            int rightP = i;
            while (leftP >= 0 && rightP < s.length() && s.charAt(leftP) == s.charAt(rightP)) {
                if (rightP - leftP + 1 > resStrLen) {
                    resStr = s.substring(leftP, rightP + 1);
                    resStrLen = rightP - leftP + 1;
                }
                leftP--;
                rightP++;
            }

            //Even Case

            leftP = i;
            rightP = i + 1;
            while (leftP >= 0 && rightP < s.length() && s.charAt(leftP) == s.charAt(rightP)) {
                if (rightP - leftP + 1 > resStrLen) {
                    resStr = s.substring(leftP, rightP + 1);
                    resStrLen = rightP - leftP + 1;
                }
                leftP--;
                rightP++;
            }
        }

        return resStr;
    }
}
