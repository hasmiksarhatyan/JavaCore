package homework.dinamicarray;

public class DinamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynarray = new DynamicArray();
        dynarray.add(7);
        dynarray.add(55);
        dynarray.add(4);
        dynarray.add(8);
        dynarray.add(9);
        dynarray.add(15);
        dynarray.printArray();
        System.out.println();
        System.out.println(dynarray.isEmpty());
        System.out.println(dynarray.getByIndex(1));
        System.out.println(dynarray.getFirstIndexByValue(5));
        dynarray.set(4, 100);
        System.out.println();
        dynarray.add(3, -6);
        System.out.println();
        dynarray.delete(4);
    }
}

