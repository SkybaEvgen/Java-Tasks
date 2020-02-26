/*
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Read_file_c_помощью_параметра_и_сортировка_Treemap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();

        while (reader.ready()) {
            String s = reader.readLine();
            String[] words = s.split("\\s");
            if (map.containsKey(words[0])) {
                double d = map.get(words[0]);
                map.put(words[0], d + Double.parseDouble(words[1]));
            } else map.put(words[0], Double.parseDouble(words[1]));
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        reader.close();
    }
}
