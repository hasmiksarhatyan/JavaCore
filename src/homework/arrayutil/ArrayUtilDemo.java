package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil au = new ArrayUtil();
        au.number(numbers);
        System.out.println();
        System.out.println("max = " + au.max(numbers));
        System.out.println("min = " + au.min(numbers));
        au.oddnums(numbers);
        au.evennums(numbers);
        System.out.println();
        System.out.println("count of odd numbers = " + au.countofodd(numbers));
        System.out.println("count of even numbers = " + au.countofeven(numbers));
        System.out.println("sum = "+ au.sum(numbers));
        System.out.println("arithmetic average = " +(au.sum(numbers)/ numbers.length));
        au.sort(numbers);

    }
}


