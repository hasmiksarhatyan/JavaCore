package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {-10, -100, 27, 5, -9, 0, 12, 255, 600};
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length - 1; k++) {
                int j = 0;
                for (int num : numbers) {
                    if (num < numbers[j + 1]) {
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = num;
                        j++;
                    } else j++;
                    if (j == numbers.length - 1) break;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int k = 0;
                for (int num : numbers) {
                    if (num > numbers[k + 1]) {
                        numbers[k] = numbers[k + 1];
                        numbers[k + 1] = num;
                        k++;
                    } else k++;
                    if (k == numbers.length - 1) break;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}



