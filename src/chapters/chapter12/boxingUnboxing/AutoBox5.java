package chapters.chapter12.boxingUnboxing;


// Автоупаковка/распаковка значений
//из классов Boolean и Character
class AutoBoxS {
    public static void main(String args[]) {
        // Автоупаковка/распаковка логического значения типа boolean
        Boolean b = true;
        // объект b автоматически распаковывается,
        //когда он употребляется в условном операторе if
        if (b) System.out.println("b равно true");
        // Автоупаковка/распаковка значения типа char
        Character ch = 'х'; //упаковать значение типа char
        char ch2 = ch; //распаковать значение типа char
        System.out.println("ch2 равно " + ch2);
    }
}