package com.company;

public class IsPalindrome {
    public int isPalindrome(int A) {
        String s=Integer.toString(A);
        int len=s.length();
        for(int i=0;i<(len/2);i++){
            int j=len-i-1;
            if(s.charAt(i)==s.charAt(j)){
                continue;
            }else{
                return 0;
            }

        }
        return 1;
    }

    // or

//    public int isPalindrome(int A) {
//
//        int original = A;
//        int t = 0;
//
//        while (A > 0) {
//            t = 10 * t;
//            t += A % 10;
//            A /= 10;
//        }
//
//        if (t == original) {
//            return 1;
//        }
//
//        return 0;
//
//    }
}
