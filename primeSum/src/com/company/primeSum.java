package com.company;

import java.util.ArrayList;

public class primeSum {
    public ArrayList<Integer> primesum(int A) {
        boolean prime[] = new boolean[A + 1];

        for (int i = 0; i <= A; i++) {
            prime[i] = true;
        }
        for (int j = 2; j * j <= A; j++) {
            if (prime[j]) {
                for (int k = 2 * j; k <= A; k += j) {
                    prime[k] = false;
                }
            }
        }
        ArrayList<Integer> arr1= new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            if (prime[i] && prime[A-i]) {
                arr1.add(i);
                arr1.add(A-i);
                break;
            }
        }
        return arr1;
    }
}
