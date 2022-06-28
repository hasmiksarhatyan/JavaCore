package homework.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) {
        studentStorage.add(new Student("Hasmik", "Sarhatyan", 33, "91784840", "ijevan", "java"));
        boolean run = true;
        while (run) {
            System.out.println("please input " + Commands.EXIT + " for exit");
            System.out.println("please input " + Commands.ADD_STUDENT + " for add student");
            System.out.println("please input " + Commands.PRINT_ALL_STUDENTS + " for print all student");
            System.out.println("please input " + Commands.DELETE_STUDENT_BY_INDEX + " for delete student by index");
            System.out.println("please input " + Commands.PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
            System.out.println("please input " + Commands.PRINT_STUDENT_COUNT + " for print students count");
            System.out.println("please choose " + Commands.CHANGE_STUDENT_LESSON + " for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case Commands.EXIT:
                    run = false;


                    break;
                case Commands.ADD_STUDENT:
                    addstudents();
                    break;
                case Commands.PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case Commands.DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case Commands.PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case Commands.PRINT_STUDENT_COUNT:
                    System.out.println("student count " + studentStorage.getSize());
                    break;
                case Commands.CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                default:
                    System.out.println("invalid command ");
            }

        }

    }

    private static void changeStudentLessonName() {
        System.out.println("please choose student index ");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong Index! ");
        } else {
            System.out.println("Please input new lesson name ");
            String newLessonName = scanner.nextLine();
            if (newLessonName!=null&&!newLessonName.trim().equals("")){
            student.setLesson(newLessonName.trim());
            System.out.println("lesson name changed!");}
        }
    }


    private static void printStudentsByLessonName() {
        System.out.println("please enter lesson name ");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please choose student index ");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByInndex(index);
    }

    private static void addstudents() {
        System.out.println("Please input student's name ");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson");
        String lesson = scanner.nextLine();
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");
    }
}
