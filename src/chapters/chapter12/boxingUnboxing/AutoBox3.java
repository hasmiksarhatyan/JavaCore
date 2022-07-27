package chapters.chapter12.boxingUnboxing;

// Автоупаковка/распаковка происходит в выражениях
class AutoBox3 {
    public static void main(String args[]) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Исходное значение iOb: " + iOb);
        //В следующем выражении автоматически распаковывается объект iOb,
        // выполняется приращение получаемого значения,
        // которое затем упаковывается обратно в объект iOb
        ++iOb;
        System.out.println("Пocлe ++iOb: " + iOb);
        // Здесь объект iOb распаковывается, выражение вычисляется,
        // а результат снова упаковывается и присваивается объекту iOb2
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 после выражения: " + iOb2);
        //Здесь вычисляется то же самое выражение, но результат не упаковывается
        i = iOb + (iOb / 3);
        System.out.println("i после выражения: " + i);
    }
}