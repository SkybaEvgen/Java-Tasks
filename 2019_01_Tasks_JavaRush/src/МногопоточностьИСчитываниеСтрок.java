/*
Кто первый встал - того и тапки
1. Разберись, что делает программа.
1.1. Каждая нить должна читать с консоли строки. Используй готовый static BufferedReader reader.
1.2. Используй AtomicInteger readStringCount, чтобы посчитать, сколько строк уже считано с консоли всеми нитями.
2. Реализуй логику метода run:
2.1. Пока нить не прервана (!isInterrupted) читай с консоли строки и добавляй их в поле List<String> result.
2.2. Используй readStringCount для подсчета уже считанных с консоли строк.


Требования:
1. Метод run должен работать пока нить не прервана (!isInterrupted).
2. Метод run НЕ должен создавать свои InputStreamReader-ы или BufferedReader-ы.
3. Метод run должен считывать строки из reader и добавлять их в список result.
4. Метод run должен после каждого считывания увеличивать счетчик прочитанных строк readStringCount на 1.
5. Программа должна выводить данные, считанные каждым потоком.


//пример входных данных и результата

10  //сколько строк считать
1  //первая строка для считывания потоками
2
3
4
5
6
7
8
9
10       //ввод заканчивается здесь
//вывод начинается отсюда
#1:[2, 4, 5, 8, 10]  // то что удалось считать 1-ому потоку
#2:[6] // то что удалось считать 2-ому потоку
#3:[1, 3, 7, 9] // то что удалось считать 3-ему потоку

https://ru.stackoverflow.com/questions/732637/java-%d0%9a%d0%b0%d0%ba-%d0%bf%d1%80%d0%b0%d0%b2%d0%b8%d0%bb%d1%8c%d0%bd%d0%be-%d0%b8%d1%81%d0%bf%d0%be%d0%bb%d1%8c%d0%b7%d0%be%d0%b2%d0%b0%d1%82%d1%8c-bufferedreader-%d0%be%d0%b4%d0%bd%d0%be%d0%b2%d1%80%d0%b5%d0%bc%d0%b5%d0%bd%d0%bd%d0%be-%d0%bd%d0%b5%d1%81%d0%ba%d0%be%d0%bb%d1%8c%d0%ba%d0%b8%d0%bc%d0%b8-%d0%bf%d0%be%d1%82%d0%be%d0%ba%d0%b0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class МногопоточностьИСчитываниеСтрок {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());

        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > readStringCount.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run() {
            //add your code here - добавьте код тут
            try {
                while (!(Thread.currentThread().isInterrupted())) {
                    if (reader.ready()) {
                        result.add(reader.readLine());
                        readStringCount.incrementAndGet();
                    }
                }

            } catch (IOException e) {
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
