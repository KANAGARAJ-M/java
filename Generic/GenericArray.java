package Generic;

import java.util.Arrays;
import java.util.Comparator;

public class GenericArray<T> {
    private T[] array;
    private int size;

    // Constructor
    // @SuppressWarnings("unchecked")
    // @SuppressWarnings("unchecked")
    public GenericArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        Capacity();
        array[size++] = element;
    }

    
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(array, 0, size, comparator);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void Capacity() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
