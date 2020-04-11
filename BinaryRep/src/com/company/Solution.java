package com.company;

public class Solution {
    public String findDigitsInBinary(int A) {
        StringBuilder s =new StringBuilder();
    if(A==0){
        return "0";
    }
    while(A>0){
        int remain=A%2;
        s.append(remain);
        A=A/2;
    }
    return  s.reverse().toString();
    }
}
