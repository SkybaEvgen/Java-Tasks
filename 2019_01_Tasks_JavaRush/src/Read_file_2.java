import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
Минимальный байт
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Read_file_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Set<Integer> setBites = new TreeSet<>();
        List<Integer> listTemp = new ArrayList<>();

        while (inputStream.read() > 0) {
            int data = inputStream.read();
            listTemp.add(data);
            setBites.add(data);
        }
        inputStream.close();

        System.out.println(setBites.iterator().next());  // выводим первый элемент
        System.out.println(listTemp);
    }
}
