package chapters.chapter14;

//Использовать оператор instanceof в иерархии

//обобщенных классов
class Gen1<T> {
    T ob;

    Gen1(T o) {
        ob = o;
    }

    // возвратить объект оb
    T getob() {
        return ob;
    }
}

// Подкласс, производный от класса Gen
class Gen2<T> extends Gen1<T> {
    Gen2(T o) {
        super(o);
    }
}


// продемонстрировать последствия динамической
// идентификации типов в иерархии обобщенных классов
class HierDemoЗ {
    public static void main(String args[]) {
        //создать объект типа Gen для целых чисел
        Gen1<Integer> iob = new Gen1<Integer>(88);
        //создать объект типа Gen для целых чисел
        Gen2<Integer> iob2 = new Gen2<Integer>(99);
        //создать объект типа Gen2 для символьных строк
        Gen2<String> strob2 = new Gen2<String>("Tecт обобщений");
        //проверить, является ли объект iOb2 какой-нибудь из форм класса Gen2
        if (iob2 instanceof Gen2<?>)
            System.out.println("Oбъeкт iOb2 является "
                    + "экземпляром класса Gen2");
        // проверить,является ли объект iOb2 какой - нибудь
        //из форм класса Gen
        if (iob2 instanceof Gen1<?>)
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen");
        System.out.println();
        //проверить,является ли strOb2 объектом класса Gen2
        if (strob2 instanceof Gen2<?>)
            System.out.println("Oбъeкт strOb2 является " + "экземпляром класса Gen2");
        // проверить,является ли strOb2 объектом класса Gen
        if (strob2 instanceof Gen1<?>)
            System.out.println("Oбъeкт strOb2 является " + "экземпляром класса Gen");
        System.out.println();
        // проверить,является ли iOb экземпляром
        //класса Gеn2, что совсем не так
        if (iob instanceof Gen2<?>)
            System.out.println("Oбъeкт iOb является" + "экземпляром класса Gen2");
        // проверить,является ли iOb экземпляром
        //класса Gen, что так и есть
        if (iob instanceof Gen1<?>)
            System.out.println("Oбъeкт iOb является " + "экземпляром класса Gen");
        //Следующий код не скомпилируется, так как
        // сведения об обобщенном типе отсутствуют
        //во время выполнения
        // if (iOb2 instanceof Gen2<Integer>)
        // System.out.println("Oбъeкт iOb2 является "
        // + "экземпляром класса Gen2<Integer>");
    }
}