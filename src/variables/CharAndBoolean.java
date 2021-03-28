package variables;

/**
 * Different ways to use a char in v1.0
 *
 * @author Maverick D. Aece
 * @version 1.0
 */

public class CharAndBoolean {
    public static void main(String[] args) {
        char myChar = 'A';
        char myUnicodeChar = '\u0042';
        char copyRight = '\u00A9';
        System.out.println("Char: " + myChar);
        System.out.println("Copyright: " + copyRight);
        System.out.println("Unicode Char: " + myUnicodeChar);

        boolean myBoolean = true;
    }
}
