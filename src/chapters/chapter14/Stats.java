package chapters.chapter14;

// быть классом NumЬer или наследуемым от него классом
class Stats<T extends Number> {
    T[] nums; //массив класса Number или его подкласса

    //передать конструктору ссылку на массив элементов
    //класса Number или его подкласса
    Stats(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    //Определить равенство двух средних значений.
    //Обратите внимание на применение метасимвола подстановки
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}

//продемонстрировать применение класса Stats
class BoundsDemo {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);
    }
}
//Этот код не скомпилируется, так как класс String
//не является производным от класса Number
// String strs[] = { "1", "2", "3", "4", "5" };
// Stats<String> strob = new Stats<String>(strs);
// double х = strob.average();
// System.out.println("Cpeднee значение strob равно " + v);


//Продемонстрировать применение метасимвола подстановки
class WildcardDemo {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);
        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double х = fob.average();
        System.out.println("Cpeднee значение fob равно " + х);
        // выяснить, какие массивы имеют одинаковые средние значения
        System.out.print("Cpeдниe значения iob и dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("paвны.");
        } else {
            System.out.println("oтличaютcя.");
        }
        System.out.print("Cpeдниe iob и fob ");
        if (iob.sameAvg(fob)) {
            System.out.println("oдинaкoвы.");
        } else {
            System.out.println("oтличaютcя.");
        }
    }
}