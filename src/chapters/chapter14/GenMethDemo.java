package chapters.chapter14;

// Продемонстрировать простой обобщенный метод
class GenMethDemo {
    // определить, содержится ли объект в массиве
    static <T extends Comparable<T>, V extends T>
    boolean isin(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        // применить метод isin() для целых чисел
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isin(2, nums))
            System.out.println("Чиcлo 2 содержится в массиве nums");
        if (!isin(7, nums))
            System.out.println("Чиcлo 7 отсутствует в массиве nums");
        System.out.println();
        // применить метод isin() для символьных строк
        String strs[] = {"один", "два", "три",
                "четыре", "пять "};
        if (isin("двa", strs))
            System.out.println(
                    "два содержится в массиве strs");
        if (!isin("ceмь", strs))
            System.out.println("ceмь отсутствует в массиве strs");
        // Не скомпилируется! Типы должны быть совместимы
        // if(isin("двa", nums))
        // System.out.println("двa содержится в массиве strs ");
    }
}
