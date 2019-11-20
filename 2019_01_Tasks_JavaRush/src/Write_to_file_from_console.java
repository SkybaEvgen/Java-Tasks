import java.io.*;

/*Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.*/

public class Write_to_file_from_console {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            File file = new File(bufferedReader.readLine());

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            String line;
            while (!(line = bufferedReader.readLine()).equals("exit")){
                bufferedWriter.write(line + "\n");

            }

            bufferedWriter.write("exit");


            bufferedReader.close(); // закрываем потоки
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
