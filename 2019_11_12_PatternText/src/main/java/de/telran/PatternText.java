/* Дано две строки (pattern и text). Определить является ли pattern подпоследовательностью text
    pattern = Hwd
    text = Hello world
    результат true */

package de.telran;

public class PatternText {
    public boolean patternText (String pattern, String text) {

        if (pattern.length() == 0) return true;

        if (pattern.length() == 1 && text.length() == 1) return pattern.equals(text);

        if (pattern.charAt(pattern.length() - 1) == text.charAt(text.length() - 1)) {
            pattern = pattern.substring(0, pattern.length() - 1);
            text = text.substring(0, text.length() - 1);
        }

        if (pattern.charAt(pattern.length() - 1) != text.charAt(text.length() - 1)) {
            text = text.substring(0, text.length() - 1);
        }

        return patternText (pattern, text);
    }
}
