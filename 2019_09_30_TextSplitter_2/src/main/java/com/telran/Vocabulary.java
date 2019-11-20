package com.telran;
/*  Есть словарь, т. е. Set<String> (в нем содержатся не повторяющиеся слова).
    Есть строка String, которая содержит слово из этого словаря. Написать алгоритм, который принимает эту строку и выводит
    все слова из словаря на которые разбивается строка String.

 */
import java.util.*;

public class Vocabulary {

    public Set<String> revealAllCompositeWords(Set<String> vocabulary) {
        Set<String> res = new HashSet<>();
        Set<String> tempVocabulary = new HashSet<>(vocabulary);
        for (String word : vocabulary) {
            tempVocabulary.remove(word);
            TextSplitter textSplitter = new TextSplitter(tempVocabulary);

            try {
                textSplitter.splitText(word);
                res.add(word);

                tempVocabulary.add(word);

            } catch (NotSplitException e) {
                tempVocabulary.add(word);
            }
        }
        return res;
    }
}
