package Test;

import static Algorithms.main.isPrimeI;
import static Algorithms.main.isPrimeII;
import static Algorithms.main.updateStack;

public class test {
    public static void main(String[] arg) {

    for (int i = 2; i<=1000; i++) {
        System.out.println(i + " | " + isPrimeI(i)); } /**/

    updateStack(1000);   /* UPDATE STACK WITH ENOUGH VALUES BEFORE RUNNING isPrimeII(n) */

    System.out.println(isPrimeII(997*997-2)); /**/

    }
}
