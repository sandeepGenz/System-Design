package src.main.java.Generics;

import java.util.Objects;

public class CustomArrayList {

    public static void main(String[] args) {

        // without explicit type decleration
        MyArrayList list = new MyArrayList();
        list.add(20);
        list.add("sandeep");

        // with explicit type decleration

        MyArrayList<Integer> intList = new MyArrayList<>();
        MyArrayList<String> strList = new MyArrayList<>();

        intList.add(20);
        intList.add(200);

        System.out.println(intList.get(1));

        strList.add("sasas");
        strList.add("sdfsdf");

        System.out.println(strList.get(1));


    }

}

class MyArrayList<T> {
    private Object[] elements;
    private int size = 0;


    public MyArrayList() {
        elements = new Object[10]; // default capacity
    }

    public void add(T element) {
        if(elements.length == size) {
            resize();
        }

        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        return (T) elements[index];
    }

    public void resize() { // check check
        Objects[] newElements = new Objects[elements.length * 2];
        System.arraycopy(elements,0,newElements,0,elements.length);
        elements = newElements;

    }

}
