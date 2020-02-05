import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты

Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Read_file_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Map<Integer, Integer> mapBites = new HashMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (!mapBites.containsKey(data)) {
                mapBites.put(data, 1);
            } else mapBites.put(data, mapBites.get(data) + 1);
        }
        inputStream.close();
        List<Integer> listMaxKey = new ArrayList<>();
        int maxValueInMap = (Collections.max(mapBites.values()));           // получаем максимальное значение в mapBites
        for (Map.Entry<Integer, Integer> entry : mapBites.entrySet()) {     // перебор mapBites
            if (entry.getValue() == maxValueInMap) {
                listMaxKey.add(entry.getKey());
            }
        }

        for (int i = 0; i < listMaxKey.size(); i++) {
            System.out.print(listMaxKey.get(i) + " ");      //В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
        }
//        System.out.println(listMaxKey);


    }
}
