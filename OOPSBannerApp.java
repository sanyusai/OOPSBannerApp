/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap inner class
 * to encapsulate character-to-pattern mappings. The application retrieves and
 * displays the "OOPS" banner using these mappings.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates character pattern mappings for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                " *** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " *** "
            }),
            new CharacterPatternMap('P', new String[] {
                "***** ",
                "**   **",
                "**   **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
            }),
            new CharacterPatternMap('S', new String[] {
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "     **",
                "     **",
                "***** "
            }),
            new CharacterPatternMap(' ', new String[] {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
            })
        };
    }

    /**
     * Retrieves pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // space fallback
    }

    /**
     * Prints message as ASCII banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append("  ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
