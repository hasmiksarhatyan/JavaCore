package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ',};
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





