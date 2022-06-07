package homework.bracechecker;

public class Stack {
    private char[] array = new char[20];
    public int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length-1) {
            System.out.println("stack-ը վերջացավ ");
        } else {
            array[++size] = value;
        }
    }

    public char pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else return array[size--];
    }
}
