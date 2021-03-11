package Algorithms;

import java.util.ArrayList;

public class main {

    // Primality Test

        // Basic Brute Force Algorithm:
    public static boolean isPrimeI(Integer n) { /* O(sqrt(n)) */
        boolean primality = true;
        if (n % 2 == 0) { primality = false; }
        else {
            Integer r = floorRoot(n);
            int i = 3;
            while (i < r) {
                if (n % i == 0) { primality = false; break;  }
                i += 2; }
        }
        return primality;
    }

        // Stack Based Algorithm:
    public static boolean isPrimeII(Integer n) {
        boolean primality = false;

        if (primesArray.contains(n)) { primality = true; }
        else {
            Integer r = floorRoot(n);
            int l = primesArray.size();
            if (r <= primesArray.get(l)) {
                int i = 0;
                while (i < l) {
                    int divisor = primesArray.get(l);
                    if (n % divisor == 0) { primality = false; break; }
                    i++; }
            }
            else { System.out.println("Unable to compute primality: Not enough primes in the stack"); }
        }

        return primality;
    }
        // <PRIVATE> Update Primes Stack
    private static void updateStack(Integer n) {

    }

    private static ArrayList<Integer> primesArray = new ArrayList<>();


    // <PRIVATE> Auxiliary Methods
    private static Integer floorRoot(Integer n) {
        return (int) Math.floor(Math.sqrt(n));
    }
}
