/*
Два в одном

Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Read_file_записатьВ1_йСо2_гоИДописатьВ1_йс3_го {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileOutputStream outputStreamFile1 = new FileOutputStream(file1, true);
        FileInputStream inputStreamFile2 = new FileInputStream(file2);
        FileInputStream inputStreamFile3 = new FileInputStream(file3);

        while (inputStreamFile2.available() > 0) {
            byte[] buffer = new byte[inputStreamFile2.available()];
            int count = inputStreamFile2.read(buffer);
            outputStreamFile1.write(buffer, 0, count);
        }

        while (inputStreamFile3.available() > 0) {
            byte[] buffer = new byte[inputStreamFile3.available()];
            int count = inputStreamFile3.read(buffer);
            outputStreamFile1.write(buffer, 0, count);
        }


        outputStreamFile1.close();
        inputStreamFile2.close();
        inputStreamFile3.close();
    }
}
