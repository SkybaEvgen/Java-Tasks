package com.telran;
/*  есть словарь, т. е. Set<String> (в нем содержатся не повторяющиеся слова).
    есть строка String. Написать алгоритм, который принимает эту строку и выводит разбиение этой строки по словам, если это возможно.
    Выкинуь созданную свою Exception, если не удалось разбить строку на слова. (слова должны быть из словаря).
 */
import java.util.*;

public class TextSplitter {
    private Set<String> vocabulary;

    public TextSplitter(Set<String> vocabulary) {
        this.vocabulary = vocabulary;
    }

    public List<String> splitText(String text) throws NotSplitException {
        LinkedList<String> res = new LinkedList<>();

        splitTextRecursively(text, res);
        return res;
    }

    private void splitTextRecursively(String text, LinkedList<String> result) throws NotSplitException {
        if (text.equals(""))
            return;

        for (String word : vocabulary) {
            int wordLength = word.length();
            if (text.startsWith(word)) {
                result.add(word);
                try {
                    splitTextRecursively(text.substring(wordLength), result);
                    return;
                } catch (NotSplitException e) {
                    result.removeLast();
                }
            }
        }
        throw new NotSplitException();
    }
}

class NotSplitException extends Exception {
}
