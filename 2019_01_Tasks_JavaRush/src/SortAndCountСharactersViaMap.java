/*
Встречаемость символов

Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortAndCountСharactersViaMap {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        List<Integer> listWords = new ArrayList<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        /*while (input.available() > 0) {
            listWords.add(input.read());
        }

        input.close();

        for (Integer i : listWords) {                           // сортируем и подсчитываем количество символов
            if (!treeMap.containsKey(i)) {
                treeMap.put(i, 1);
            } else treeMap.put(i, treeMap.get(i) + 1);
        }

        for (Map.Entry entry : treeMap.entrySet()) {
            char c = (char) (int) entry.getKey();           // преобразовываем Integer -> int -> char
            System.out.println(c + " " + entry.getValue());
        }*/

        //---------------------second way----------------------------------------

        while (input.available() > 0) {
            int a = input.read();
            treeMap.put(a, treeMap.containsKey(a) ? treeMap.get(a) + 1 : 1);
        }
        input.close();
        treeMap.forEach((k, v) -> System.out.println((char) k.intValue() + " " + v));
    }
}
