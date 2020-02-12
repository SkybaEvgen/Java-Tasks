/*
Встречаемость символов
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
