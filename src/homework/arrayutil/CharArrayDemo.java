package homework.arrayutil;

public class CharArrayDemo {
    public static void main(String[] args) {
        CharArray ch = new CharArray();
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("countofc = " + ch.countofc(chars));
        ch.middleelements(chars);
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println(ch.lastelemetsisly(chars3));
        char[] bobArray = {'k', 'a', 'b', 'b', 'l', 'b'};
        ch.bob(bobArray);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        ch.text(text);
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ',};
        System.out.println();
        ch.catbib(spaceArray);

    }
}
