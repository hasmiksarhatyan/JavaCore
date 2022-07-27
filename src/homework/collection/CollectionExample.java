package homework.collection;

import java.util.*;

public class CollectionExample {
    static List<String> stringList = new ArrayList<>();
    static List<Integer> numberList = new LinkedList<>();
    static String[] values = {"hello", "from", "java"};

    public static void main(String[] args) {
        System.out.println(arrayToList(values));
        System.out.println(removeById(stringList, 1));
        System.out.println(listToSet(stringList));
        numberList.add(5);
        numberList.add(88);
        numberList.add(7);
        System.out.println(listToLinkedList(numberList));
        System.out.println(reverseNumbers(numberList));
        printFirstFive(stringList);
        System.out.println(sizeOfList(numberList));
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        stringList.addAll(List.of(values));
        return stringList;

    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {

        return new HashSet<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {

        return new LinkedList<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {

        Collections.reverse(list);
        return list;
    }


    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        if (list.size() > 4) {
            System.out.println(list.subList(0, 5));
        } else System.out.println(list);
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<?> list) {
        return list.size();
    }

}
