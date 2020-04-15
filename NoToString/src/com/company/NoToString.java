package com.company;

public class NoToString {
    public String convertToTitle(int A) {
        StringBuilder s = new StringBuilder();
        char c='A';
        int a=c;

        while(A > 0){
            int n = A%26;

            if(n == 0){
                s.append("Z");
                A = A/26 - 1;
            }
            else{
                s.append((char)(a+n-1));
                A = A/26;
            }
        }

        return s.reverse().toString();
    }

}
