/*Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ?
и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка
всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14

Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае, если значение
параметра obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае, если значение
параметра obj НЕ может быть корректно преобразовано в число типа double.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ПарсерРеквестов {

    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        List<String> list = new ArrayList<>();
        String sNew = s.substring(s.indexOf("?") + 1);
        String[] split = sNew.split("&");
        Object obj = null;

        for (int i = 0; i < split.length; i++) {
            if(split[i].contains("=")) {
                list.add(split[i].substring(0, split[i].indexOf("=")));
            }else {
                list.add(split[i]);
            }
        }
        for (String q : list){
            System.out.print(q + " ");
        }
        System.out.println("");

        for (int i = 0; i < split.length; i++) {
            if(split[i].contains("obj")) {
                obj = split[i].substring(split[i].indexOf("=")+1);
                try {
                    alert(Double.parseDouble(String.valueOf(obj)));
                }catch (NumberFormatException e) {
                    alert((String) obj);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
