package chapters.chapter10;

public class Exc {
    public static void main(String[] args) {
        int d, a;
        try {  //проконтролирошать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("это не будет выведено.");
        } catch (ArithmeticException e) {
            //перехватить ошибку деления нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("после оператора catch.");
    }
}
