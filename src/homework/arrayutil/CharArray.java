package homework.arrayutil;

public class CharArray {

    int countofc(char[] chars) {
        char c = 'o';
        int countofc = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countofc++;
            }
        }
        return countofc;
    }

    void middleelements(char[] chars) {
        int h = chars.length / 2 - 1;
        int k = chars.length / 2;
        System.out.println("middle elements ");
        System.out.print(chars[h] + " " + chars[k]);
        System.out.println();
    }

    boolean lastelemetsisly(char[] chars3) {
        int charslastelement = chars3.length - 1;
        int charssecondlastelement = charslastelement - 1;
        if (chars3[charslastelement] == 'y' && chars3[charssecondlastelement] == 'l') {
            return true;
        } else {
            return false;
        }
    }

    void bob(char[] bobArray) {
        boolean bob = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bob = true;
                break;
            }
        }
        System.out.println(bob);
    }

    void text(char[] text) {
        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }
        }
    }

    void catbib(char[] spaceArray) {
        int i, j, k;
        for (i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') ;
            else break;
        }
        for (j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] == ' ') ;
            else break;
        }
        int lenght = j - i + 1;
        char[] result = new char[lenght];
        int index = 0;
        for (k = i; k <= j; k++) {
            result[index++] = spaceArray[k];
        }
        for (char c : result) {
            System.out.print(c);

        }
    }
}






