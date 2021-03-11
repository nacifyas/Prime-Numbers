package Algorithms;

public class main {

    // Check Prime
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

    // Generate Primes

    // <PRIVATE> Update Primes Stack

    // <PRIVATE> Auxiliary Methods
    private static Integer floorRoot(Integer n) {
        return (int) Math.floor(Math.sqrt(n));
    }
}
