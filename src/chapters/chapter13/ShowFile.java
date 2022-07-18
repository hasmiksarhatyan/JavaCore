package chapters.chapter13;
/*Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите
имя файла, который требуется посмотреть.
Например чтобы посмотреть файл TEST.TXT,
введите в командной строк е следующую команду:
java ShowFile TEST.TXT
 */

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        //сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("использование: ShowFile имя_файла");
            return;
        }
        //Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }
        //Теперь файл открыт и готов к чтению.
        //Далее из него читаются символы до тех пор , пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка закрытия файла");
        }
    }
}



