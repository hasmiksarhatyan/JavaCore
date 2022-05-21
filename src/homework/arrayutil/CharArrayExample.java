package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int countofc = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countofc++;
            }
        }
        System.out.println("countofc " + countofc);
        int h = chars.length / 2 - 1;
        int k = chars.length / 2;
        System.out.println("մեջտեղի էլեմենտները");
        System.out.print(chars[h] + " " + chars[k]);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        int charslastelement = chars3.length - 1;
        int charssecondlastelement = charslastelement - 1;
        if (chars3[charslastelement] == 'y' && chars3[charssecondlastelement] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        char[] bobArray = {'k', 'a', 'b', 'b', 'l', 'b' };
        boolean bob=false;
        for (int i = 0; i < bobArray.length-2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b')
            {bob=true;}
        }
        System.out.println(bob);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }

        }

    }
}






