package variables;

/**
 * Added code to print the max and min value of a float and a double v1.0
 *
 * @author Maverick D. Aece
 * @version 1.0
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
    }

}
