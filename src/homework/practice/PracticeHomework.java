package homework.practice;

public class PracticeHomework {

    long convert(int minutes) {
        if (minutes < 0) {
            System.out.println("value is negative");
            return 0;
        } else {
            System.out.print(minutes + " minutes = ");
            return minutes * 60L;
        }
    }

    int calcAge(int years) {
        if (years < 0) {
            return 0;
        } else {
            System.out.print(years + " years = ");
            return years * 365;
        }
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;

    }
}
