package chapters.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле метода demoproc () . ");
            throw e; // повторно сгенерировать исключение ;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("повторный перехват: "+e);
        }
    }
}
