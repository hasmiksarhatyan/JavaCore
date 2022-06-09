package homework.bracechecker;

public class Stack {
    private int[] array = new int[1];
    private int size;
    void  setSize(int i){size=i;}
    int getSize(){return size;}

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == array.length-1) {
            int[] temp=new int[array.length+10];
            for (int i = 0; i < array.length; i++) {
                temp[i]=array[i];
            }
            array=temp;
        }
            array[++size] = value;
        }


    public int pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else return array[size--];
    }
}
