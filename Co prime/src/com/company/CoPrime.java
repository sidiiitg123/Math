package com.company;

public class CoPrime {
    public int gcd(int A, int B) {
        int value;
        if (A == B) {
            return A;
        }
        if (A == 0) {
            return B;
        }
        if (B == 0) {
            return A;
        }
        if (A > B) {
            value = gcd(A - B, B);
        } else {
            value = gcd(A, B - A);
        }
        return value;
    }

    public int cpFact(int A, int B) {
        while (gcd(A, B) != 1) {
            A /= gcd(A, B);

        }
        return A;

    }
}
