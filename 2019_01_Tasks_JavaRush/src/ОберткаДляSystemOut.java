/*
Ридер обертка

Ридер обертка
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c конструктором принимающим ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ОберткаДляSystemOut {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
            //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

            //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);

            //Устанавливаем его как текущий System.out
        System.setOut(stream);

            //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

            //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

            //Возвращаем все как было
        System.setOut(consoleStream);

            //Преобразовываем весь текс в заглавные буквы
        System.out.println(result.toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
