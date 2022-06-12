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
    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false

    public boolean isEmpty() {
        return size == -1;
    }

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    public int getByIndex(int index) {
        if (index <= size && index > 0) {
            return array[index];
        } else return 0;
    }
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը


    public int getFirstIndexByValue(int value) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }
    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).

    public void set(int index, int value) {
        if (index <= size && index >= 0) {
            array[index] = value;
            printArray();
        }
    }
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի

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

    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)
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
