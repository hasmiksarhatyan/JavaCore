package chapters.chapter7.recursion;

public class Factorial {
    // Простой пример рекурсии
    // это рекурсивный метод
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
