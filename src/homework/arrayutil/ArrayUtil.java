package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {20, 7, -1, 10, 32, 10, 11, 76, 102, 33};
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i]+ " " );
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("ամենամեծ էլեմենտը " + max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("ամենափոքր էլեմենտը " + min);
        int oddnums = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddnums = array[i];
                System.out.print( oddnums + " ");
            }
        }
        System.out.println();
        int evennums = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0 && array[i] % 2 == 0) {
                evennums = array[i];
                System.out.print( evennums + " ");
            }
        }
        System.out.println();
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n++;
            }
        }
        System.out.println("զույգ էլեմենտների քանակը " + n + " ");
        int m = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                m++;
            }
        }
        System.out.println("կենտ էլեմենտների քանակը " + m + " ");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("էլեմենտների գումարը " + sum);
        System.out.println("միջին թվաբանականը " + sum / array.length);

    }
}




