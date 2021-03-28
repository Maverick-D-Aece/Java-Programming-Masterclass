package variables;

/**
 * Attempting the  challenge in 3E10
 *
 * @author Maverick D. Aece
 * @version 1.0
 */
public class PrimitiveVariablesChallenge {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 2345;
        int myInt = 123456789;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println("Final result: " + myLong);
    }
}
