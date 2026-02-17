/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case improves UC4 by initializing the String array inline
 * using String.join() for better readability and concise code.
 *
 * @author Student
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline initialization of banner lines using String.join()
        String[] lines = {
                String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", " ***** ", "*     *", " ***** "),
                String.join(" ", "*     *", "*      ", "*     *", "     *"),
                String.join(" ", "*     *", "*      ", "*     *", "     *"),
                String.join(" ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

