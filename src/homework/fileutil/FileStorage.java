package homework.fileutil;


import java.io.File;


public class FileStorage {
    private File[] array = new File[10];

    public File[] getArray() {
        return array;
    }

    private int size = 0;

    public void add(File file) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = file;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        File[] temp = new File[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }


    public int getSize() {
        return size;
    }

}