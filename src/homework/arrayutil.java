package homework;

public class arrayutil {
    public static void main(String[] args) {
        int[] array = {20, 7, -1, 10, 32, 10, 11, 76, 102, 33};
        for (int i = 0; i < 10; i++) {
            System.out.print( array[i]+ " " );
        }
        System.out.println();
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("ամենամեծ էլեմենտը " + max);
        int min = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("ամենափոքր էլեմենտը " + min);
        int oddnums = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                oddnums = array[i];
                System.out.print( oddnums + " ");
            }
        }
        System.out.println();
        int evennums = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                evennums = array[i];
                System.out.print( evennums + " ");
            }
        }
        System.out.println();
        int n = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                n = n + 1;
            }
        }
        System.out.println("զույգ էլեմենտների քանակը " + n + " ");
        int m = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                m = m + 1;
            }
        }
        System.out.println("կենտ էլեմենտների քանակը " + m + " ");
        double result = 0;
        for (int i = 0; i < 10; i++) {
            result = result + array[i];
        }
        System.out.println("էլեմենտների գումարը " + result);
        System.out.println("միջին թվաբանականը " + result / array.length);


    }
}




