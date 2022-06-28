package chapters.chapter7.retob;

public class RetOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(2);
        Test1 ob2;
        ob2=ob1.incrByTen();
        System.out.println("ob1: "+ob1.a);
        System.out.println("ob2: "+ob2.a);
        ob2=ob2.incrByTen();
        System.out.println("ob2: "+ob2.a);
    }
}
