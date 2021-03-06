package variables;

/**
 * Shows a bunch of primitive variables that we can have in Java
 * and how we can print them.
 * v1.1 shows how we can assign a new value to a variable as an expression.
 * Added a complex expression in v1.2
 * Added some more variables in v1.3
 * Assigned one variable to another variable in v1.4
 * Added a final variable that has the value 1000 less than the total, in v1.5
 * Added code to find the range of the "int" data type in v1.6
 * Busting and Boosting the max and min values respectively for "int" data type in v1.7
 * Added a new way to initialize an integer variable in v1.8
 * Added code to print the max and min value of a byte v1.9
 * Added code to print the max and min values of a short, and long in v2.0
 * Added examples and comments to show the concept of type casting in v2.1
 * [One small IntelliJ IDEA hack that I learned today - write "sout" and Ctrl+Space
 * for println template]
 *
 * @author Maverick D. Aece
 * @version 2.1
 */
public class Variables {

    public static void main(String[] args) {
        // declares and defines(initializes) an integer variable
        int number = (7 + 5) * (12 - 3);
        int anotherNumber = 8;
        int anotherAnotherNumber = number - 10;
        int total = number + anotherNumber + anotherAnotherNumber;
        int lastNumber = 1000 - total;
        System.out.println("Value of the \"total\" variable = " + total);
        System.out.println("Value of the \"lastNumber\" variable = " + lastNumber);

        // finding the range of the "int" data type
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("\nA variable of \"int\" data type can have values from " + min + " to " + max);

        // trying to add even "1" to max will result in overflow of the value in the variable
        // in this case, the value stored in max will be the same as that in min
        // and if we subtracted "1" from min then it will be the same as max
        System.out.println("BUSTED max = " + (max + 1));
        System.out.println("BOOSTED min = " + (min - 1));

        // another way to define an "int" variable (especially those with more than 5 figures)
        int largeNumber = 102_211_300;
        System.out.println("Large Number = " + largeNumber);

        // other primitive data members
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte = " + minByte);
        System.out.println("Maximum Byte = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Minimum Short = " + minShort);
        System.out.println("Maximum Short = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Minimum Long = " + minLong);
        System.out.println("Maximum Long = " + maxLong);

        // type casting when storing value of a bigger type inside a variable of smaller type
        // Java by default considers the '2' in the following expression as an int and evaluates
        // the expression into a result of an int, this is why casting was required
        byte newByte = (byte)(minByte / 2);
        short newShort = (short)(minShort / 2);
    }
}
