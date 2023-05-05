package Generic;

import java.util.List;

public class GenericList<T> {
    private T[] items ;
    private int count;

    public GenericList(int Length) {
        this.items = (T[]) new Object[Length];
    }

    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }

    public static <K, V> void print(K key, V value){
        System.out.println(key + " = "+value);
    }
}
