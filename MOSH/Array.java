package MOSH;

import java.util.Arrays;

public class Array {
    private int[] array ;
    private int count = 0;

    public Array(int size) {
        this.array = new int[size];
    }

    public void printAll(){
        for(int i = 0; i < count; i ++){
            System.out.println(array[i]);
        }
    }

    public void indexOf(int index){
        if(index < 0 || index >= count){
            System.out.println("-1");
        }else {
            System.out.println(array[index]);
        }

    }

    public void insert(int value){
        if(array.length == count){
            int[] secondArray = new int[count*2];
            for (int i = 0 ; i < count; i++){
                secondArray[i] = array[i];
            }
            array = secondArray;
        }
        array[count] = value;
        count++;
    }
    public void delete(int index){
        if(index < 0 || index >= count){
            throw  new IllegalArgumentException();
        }

        for(int i = index; i < count; i++){
            array[i] = array[i+1];
        }
        count--;
    }
}
