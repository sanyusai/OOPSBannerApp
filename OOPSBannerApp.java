import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Build character patterns using HashMap
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Render banner using nested loops and StringBuilder
    public static void printBanner(String text, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    builder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(builder.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();

        String bannerText = "OOPS";

        printBanner(bannerText, characterPatternMap);
    }
}
