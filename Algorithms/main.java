package Algorithms;

import java.util.ArrayList;

public class main {

    // Primality Test

        // Basic Brute Force Algorithm:
    public static boolean isPrimeI(Integer n) { /* O(sqrt(n)) */
        boolean primality = true;
        if (n % 2 == 0 && n > 2) { primality = false; }
        else {
            Integer r = floorRoot(n);
            int i = 3;
            while (i <= r) {
                if (n % i == 0) { primality = false; break;  }
                i += 2; }
        }
        return primality;
    }

        // Stack Based Algorithm:
    public static boolean isPrimeII(Integer n) {
        boolean primality = true;
        if (!primesArray.contains(n)) {
            Integer r = floorRoot(n);
            int l = primesArray.size()-1;
            if (r <= primesArray.get(l)) { /* This statement checks if there are enough primes in the stack to compute the primality of n */
                int i = 0;
                while (i <= l) {
                    int divisor = primesArray.get(i);
                    if (n % divisor == 0) { primality = false; break; }
                    i++; }
            }
            else { System.out.println("Unable to compute primality: No enough primes in the stack"); }
        }
        return primality;
    }
        // <PRIVATE> Update Primes Stack:
    public static void updateStack(Integer n) {
        int l = primesArray.size()-1;
        if (primesArray.isEmpty()) { l = 1; primesArray.add(2); primesArray.add(3); }
        int p = primesArray.get(l)+2;
        while (p <= n) {
            if (isPrimeII(p)) { primesArray.add(p); }
            p+=2;
        }
    }
        // The so called Primes Stack:
    private static ArrayList<Integer> primesArray = new ArrayList<>();


    // <PRIVATE> Auxiliary Methods
    private static Integer floorRoot(Integer n) {
        return (int) Math.floor(Math.sqrt(n));
    }
}
