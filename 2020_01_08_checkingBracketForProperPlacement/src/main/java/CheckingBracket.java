/*  Есть три вида скобок ( { [, ) } ].
    Проверить, корректно ли они расставлены в тексте.
    Пример: ( ) { [ ( ) ] { } }
    Вывести индекс ошибки, либо -1 если ошибок нет.
 */

import java.util.*;

public class CheckingBracket {
    public int correctBracket (String textString) {
        char[] textChars = textString.toCharArray();
        Deque<Character> brackets = new ArrayDeque<>();

        for (int i = 0; i < textChars.length ; i++) {
            if (textChars[i] == '(' || textChars[i] == '{' || textChars[i] == '[') {
                brackets.addLast(textChars[i]);
            }
            else if (textChars[i] == ')') {
                if (brackets.size() == 0 || brackets.getLast() != '(') {
                    return i;
                }
                brackets.removeLast();
            }
            else if (textChars[i] == '}') {
                if (brackets.size() == 0 || brackets.getLast() != '{') {
                    return i;
                }
                brackets.removeLast();
            }
            else if (textChars[i] == ']') {
                if (brackets.size() == 0 || brackets.getLast() != '[') {
                    return i;
                }
                brackets.removeLast();
            }
        }
        return -1;
    }
}
