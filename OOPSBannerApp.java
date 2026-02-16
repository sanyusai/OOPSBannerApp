/**
 * OOPS Banner App - UC3
 * Prints "OOPS" as a banner using String.join()
 *
 * @author Sanyu
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join("", 
                " *****   ", 
                " *****   ", 
                " *****   ", 
                " *****   ");

        String line2 = String.join("", 
                "*     *  ", 
                "*     *  ", 
                "*     *  ", 
                "*     *  ");

        String line3 = String.join("", 
                "*     *  ", 
                "*     *  ", 
                "*     *  ", 
                "*     *  ");

        String line4 = String.join("", 
                "*     *  ", 
                " *****   ", 
                "*     *  ", 
                " *****   ");

        String line5 = String.join("", 
                "*     *  ", 
                "*        ", 
                "*     *  ", 
                "      *  ");

        String line6 = String.join("", 
                "*     *  ", 
                "*        ", 
                "*     *  ", 
                "      *  ");

        String line7 = String.join("", 
                " *****   ", 
                " *****   ", 
                " *****   ", 
                " *****   ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}

