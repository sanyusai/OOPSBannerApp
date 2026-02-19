/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case refactors the banner logic into reusable static methods
 * for each character pattern (O, P, S). This improves modularity,
 * readability, and follows DRY principle.
 *
 * @author Student
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            String.join(" ", "*****"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*****")
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            String.join(" ", "*****"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*****"),
            String.join(" ", "*"),
            String.join(" ", "*"),
            String.join(" ", "*")
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            String.join(" ", "*****"),
            String.join(" ", "*"),
            String.join(" ", "*"),
            String.join(" ", "*****"),
            String.join(" ", "    *"),
            String.join(" ", "    *"),
            String.join(" ", "*****")
        };
    }

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner using loop
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "   " +
                oPattern[i] + "   " +
                pPattern[i] + "   " +
                sPattern[i]
            );
        }
    }
}

