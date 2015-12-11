package abbr;

import java.util.HashSet;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */

    public static String abbreviate(String string)
    {
        // TODO: Write this method.

        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String abbreviatedString = "";
        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(string.charAt(i))) {
                continue;
            }
            abbreviatedString += string.charAt(i);
        }
        return abbreviatedString;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
