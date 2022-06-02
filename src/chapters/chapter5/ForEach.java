package chapters.chapter5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println(x);
            sum += x;
        }
        System.out.println("sum = " + sum);
        int numbers[][] = new int[3][5];
        int summ=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] x : numbers) {
            for (int y : x) {
                System.out.println(y);
                summ += y;
            }
        }
        System.out.println("sum= " + summ);
    }
}
