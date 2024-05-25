package Generic;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        testIntegerArray();
        testStringArray();
    }

    private static void testIntegerArray() {
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.add(3);
        intArray.add(1);
        intArray.add(4);
        intArray.add(9);
        intArray.add(5);
        System.err.println();
        System.err.println();
        System.out.println("Integer Array before sorting: ");
        intArray.display();
        System.err.println();
        System.err.println();

        intArray.sort(Comparator.naturalOrder());
        System.out.println("Integer Array after sorting:");
        intArray.display();
    }

    private static void testStringArray() {
        GenericArray<String> strArray = new GenericArray<>(5);
        
        strArray.add("banana");
        strArray.add("cherry");
        strArray.add("apple");
        strArray.add("elderberry");
        strArray.add("date");
        System.err.println();
        System.err.println();
        System.out.println("String Array before sorting:");
        strArray.display();
        System.err.println();
        System.err.println();
        strArray.sort(Comparator.naturalOrder());
        System.out.println("String Array after sorting:");
        strArray.display();
        System.err.println();
        System.err.println();
    }
}
