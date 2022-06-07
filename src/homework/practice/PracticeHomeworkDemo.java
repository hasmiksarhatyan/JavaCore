package homework.practice;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(5) + " seconds");
        System.out.println(ph.calcAge(2) + " days");
        System.out.println(ph.nextNumber(-1));
        System.out.println(ph.isSameNum(5, 24));
        System.out.println(ph.lessThanOrEqualToZero(-5));
        System.out.println(ph.reverseBool(true));
        int[] array1 = {5, 4, 3, 58, 8};
        int[] array2 = {25, 47, 8, 0, 4};
        System.out.println(ph.maxLength(array1, array2));
    }
}
