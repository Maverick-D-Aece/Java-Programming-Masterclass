package variables;

/**
 * Shows a bunch of primitive variables that we can have in Java
 * and how we can print them.
 * v1.1 shows how we can assign a new value to a variable as an expression.
 * Added a complex expression in v1.2
 * Added some more variables in v1.3
 *
 * @author Maverick D. Aece
 * @version 1.3
 */
public class Variables {

    public static void main(String[] args) {
        // declares and defines(initializes) an integer variable
        int number = (7 + 5)  * (12 - 3);
        int anotherNumber = 8;
        int anotherAnotherNumber = 9;
        int total = number + anotherNumber + anotherAnotherNumber;
        System.out.println("Value of the \"total\" variable = " + total);
    }
}
