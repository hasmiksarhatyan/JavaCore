package chapters.chapter12.enums;

public class EnumDemo2 {
    public static void main(String args[]) {
        Apple ap;
        System.out.println(
                "Константы перечислимого типа Apple:");
        // применить метод values()
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();
        // применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}