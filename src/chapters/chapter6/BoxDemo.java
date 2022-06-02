package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        System.out.println("volume is " + mybox1.volume());
        System.out.println("volume is " + mybox2.volume());
    }
}
