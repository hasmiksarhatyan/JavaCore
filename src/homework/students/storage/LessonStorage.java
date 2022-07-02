package homework.students.storage;

import homework.students.model.Lesson;

public class LessonStorage {
    private Lesson[] array = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = lesson;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Lesson[] temp = new Lesson[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    public Lesson getLessonByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }


    public void deleteByInndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index ");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

}