/**
 * OOPS Banner App - UC7
 * Demonstrates Inner Static Class to store character patterns
 * and render banner using OOPS principles.
 */
public class BannerApp {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * 
         * @param character the character
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-line pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility Methods to build patterns

    public static String[] buildOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    public static String[] buildPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    public static String[] buildSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    /**
     * Retrieves pattern for given character
     * 
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return matching pattern or null
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap patternObj : patterns) {
            if (patternObj.getCharacter() == ch) {
                return patternObj.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('P', buildPPattern()),
                new CharacterPatternMap('S', buildSPattern())
        };

        String word = "OOPS";

        // Loop-based rendering using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}