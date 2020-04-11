package com.company;

import java.util.ArrayList;

public class Prime {
    public ArrayList<Integer> seive(int A) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean prime[] = new prime[A + 1];

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
        for (int i = 2; i <= A; i++) {
            if (prime[i]) {
                arr.add(i);
            }
        }
        return arr;
    }
}

}
