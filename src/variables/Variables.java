package variables;

/**
 * Shows a bunch of primitive variables that we can have in Java
 * and how we can print them.
 * v1.1 shows how we can assign a new value to a variable as an expression.
 * Added a complex expression in v1.2
 * Added some more variables in v1.3
 * Assigned one variable to another variable in v1.4
 * Added a final variable that has the value 1000 less than the total, in v1.5
 * [One small IntelliJ IDEA hack that I learned today - write "sout" and Ctrl+Space
 * for println template]
 *
 * @author Maverick D. Aece
 * @version 1.5
 */
public class Variables {

    public static void main(String[] args) {
        // declares and defines(initializes) an integer variable
        int number = (7 + 5)  * (12 - 3);
        int anotherNumber = 8;
        int anotherAnotherNumber = number - 10;
        int total = number + anotherNumber + anotherAnotherNumber;
        int lastNumber = 1000 - total;
        System.out.println("Value of the \"total\" variable = " + total);
        System.out.println("Value of the \"lastNumber\" variable = " + lastNumber);
    }
}
