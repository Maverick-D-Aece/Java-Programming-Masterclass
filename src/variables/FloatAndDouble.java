package variables;

/**
 * Added code to print the max and min value of a float and a double in v1.0
 * Added type-casting to make the float value valid in v1.1
 * Added code that shows the precision of floats and doubles in v1.2
 *
 * @author Maverick D. Aece
 * @version 1.2
 */
public class FloatAndDouble {

    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Minimum Float = " + minFloat);
        System.out.println("Maximum Float = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Minimum Double = " + minDouble);
        System.out.println("Maximum Double = " + maxDouble);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f; // or, 5.25f
        double myDouble = 5.00 / 3.00;
        System.out.println("\nInt = " + myInt);
        System.out.println("Float = " + myFloat);
        System.out.println("Double = " + myDouble);
    }

}
