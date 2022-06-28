package chapters.chapter7.overload;

public class Overload {
    // Продемонстрировать перегрузку методов
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);}


    // Перегружаемый метод, проверяющий наличие
// двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    //параметра типа double
    double test(double a) {
        System.out.println("double а: " + a);
        return a * a;
    }
}


