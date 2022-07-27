package chapters.chapter14;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа т и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы Т и V
    void showТypes() {
        System.out.println("Tип Т: " + ob1.getClass().getName());
        System.out.println("Tип V: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

// продемонстрировать применение класса ТWoGen
class SimpGen {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");
        // показать типы
        tgObj.showТypes();
        // Получить и показать значения
        int v = tgObj.getob1();
        System.out.println("Знaчeниe: " + v);
        String str = tgObj.getob2();
        System.out.println("Знaчeниe: " + str);
    }
}