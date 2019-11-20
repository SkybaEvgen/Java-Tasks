package de.telran;

public class SubsequenceFinder {
    public boolean isSubsequence(String pattern, String text) {
        return isSubsequence(pattern, text, pattern.length() - 1, text.length() - 1);
    }

    private boolean isSubsequence (String pattern, String text, int indexPattern, int indexText) {
        if (indexPattern < 0) return true;

        if (indexText < indexPattern) return false;

        if (text.charAt(indexText) == pattern.charAt(indexPattern)) {
            return isSubsequence(pattern, text, indexPattern - 1, indexText - 1);
        }

        return isSubsequence(pattern, text, indexPattern, indexText - 1);
    }
}
