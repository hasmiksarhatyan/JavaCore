package chapters.chapter8.box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("weightbox = " + weightbox.weight);
        // присвоить переменной ссылки на объект типа BoxWeight ссылку на объект типа Вох
        plainbox = weightbox;
        vol = plainbox.volume(); //!Верно, так как метод volume()определен в классе Вох
        System.out.println("Oбъeм plainbox равен " + vol);
        /* Следующий оператор ошибочен, поскольку член plainbox
        не определяет член weight. */
        // System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
