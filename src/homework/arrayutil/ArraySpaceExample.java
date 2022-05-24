package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ',};
        char[] result = spaceArray;
        int i, j, k;
        for (i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') ;
            else break;
        }
        for (j = spaceArray.length - 1; j < spaceArray.length; j--) {
            if (spaceArray[j] == ' ') ;
            else break;
        }
        for (k = i; k <= j; k++) {
            System.out.print(result[k]);
        }
    }
}





