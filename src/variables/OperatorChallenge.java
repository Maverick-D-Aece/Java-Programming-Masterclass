package variables;

/**
 * Attempting the Operator Challenge of 3E22 in v1.0
 *
 * @author Maverick D. Aece
 * @version 1.0
 */
public class OperatorChallenge {
    public static void main(String[] args) {
        double d1 = 20.00; // step 1
        double d2 = 80.00; // step 2
        double result = (d1 + d2) * 100; // step 3
        result = result % 40.00; // step 4

        boolean b = (result == 0); // step 5
        System.out.println(b); // step 6
        if (!b) System.out.println("Got some remainder"); // step 7
    }
}
