package homework.students.storage;

import homework.students.model.Lesson;
import homework.students.model.Student;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = student;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }


    public Student getStudentByIndex(int index) {
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

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().getName().equals(lessonName)) {
                System.out.println(array[i]);
            }

        }
    }

    public int getSize() {
        return size;
    }

    public void changeStudentLesson(int index, Lesson lessonName) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index ");
        } else {
            array[index].setLesson(lessonName);
        }
    }

    private void increaseArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

}