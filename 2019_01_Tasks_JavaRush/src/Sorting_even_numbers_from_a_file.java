/*Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting_even_numbers_from_a_file {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        reader.close();
        Scanner sc = new Scanner(in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNext()){
            list.add(Integer.parseInt(sc.nextLine()));
        }
        Collections.sort(list);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                newList.add(list.get(i));
            }
        }

        for (Integer s : newList){
            System.out.println(s);
        }
        in.close();
        sc.close();
    }
}
