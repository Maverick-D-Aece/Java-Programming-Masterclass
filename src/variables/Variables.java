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
 * [One small IntelliJ IDEA hack that I learned today - write "sout" and Ctrl+Space
 * for println template]
 *
 * @author Maverick D. Aece
 * @version 1.8
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

    }
}
