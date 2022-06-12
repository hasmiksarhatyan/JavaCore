package homework.dinamicarray;

public class DynamicArray {

    private int[] array = new int[1];
    private int size = -1;

    public void add(int value) {
        if (array.length - 1 == size) {
            extend();
        }
        array[++size] = value;
    }

    public void printArray() {
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public int getByIndex(int index) {
        if (index <= size && index > 0) {
            return array[index];
        } else return 0;
    } 

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    public void set(int index, int value) {
        if (index <= size && index >= 0) {
            array[index] = value;
            printArray();
        }
    }

    public void add(int index, int value) {
        if (index <= size && index >= 0) {
            for (int i = index; i <= size; i++) {
                int n = array[index];
                array[index] = value;
                value = array[index + 1];
                array[++index] = n;
                index++;
            }
            size += 1;
        }
        printArray();
    }

    public void delete(int index) {
        if (index <= size && index >= 0) {
            for (int i = index; i <= size; i++) {
                array[index] = array[index + 1];
                index++;
            }
            size -= 1;
        }
        printArray();
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

}
