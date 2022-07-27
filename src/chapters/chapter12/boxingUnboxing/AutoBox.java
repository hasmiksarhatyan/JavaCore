package chapters.chapter12.boxingUnboxing;


//Продемонстрировать автоупаковку/автораспаковку
class AutoBox {
    public static void main(String args[]) {
        Integer iOb = 100; // автоупаковка значения типа int
        int i = iOb; // автораспаковка значения типа int
        System.out.println(i + " " + iOb);// выводит значения 100 и 100
    }
}