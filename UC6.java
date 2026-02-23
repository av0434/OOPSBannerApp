public class BannerApp {

    // Helper method to build pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", " *** "),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", " *** ")
        };
    }

    // Helper method to build pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "**** "),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "**** "),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", "*    ")
        };
    }

    // Helper method to build pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ****"),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", " *** "),
                String.join("", "    *"),
                String.join("", "    *"),
                String.join("", "**** ")
        };
    }

    public static void main(String[] args) {

        // Call helper methods at declaration
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Loop-based rendering (7 lines)
        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}