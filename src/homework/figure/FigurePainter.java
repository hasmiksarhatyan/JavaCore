package homework.figure;
public class FigurePainter {
        char c;

        void figure1(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        void figure2() {
            for (int i = 0; i < 5; i++) {
                for (int j = 3; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

        }

        void figure3() {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        void figure4() {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int j = 3; j >= i; j--) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        void figure5() {
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
        }
    }



        
            
        


