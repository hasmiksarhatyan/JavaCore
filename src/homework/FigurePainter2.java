package homework;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 3; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();

        }
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                for (int j = 3; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print(" *");
                }
            }
            if (i > 3) {
                for (int j = 2; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 7; j > i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

}





