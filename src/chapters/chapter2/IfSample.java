package chapters.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;

        if (x < y) {
            System.out.println("x < y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x = y");
        }
    }
}
