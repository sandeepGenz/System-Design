package src.main.java.Generics;

public class Main {

    public static void main(String[] args) {
        Test.genericDisplay(1);
        Test.genericDisplay("Sandeep");
        Test.genericDisplay(1.0);


        Test2<Integer> isObj = new Test2<Integer>(20);
        System.out.println(isObj.getObj());

        Test2<String> isObj2 = new Test2<>("Sandeeep");
        System.out.println(isObj2.getObj() );

        Integer[] arr = {1,2,3,4};
        String[] sarr = {"Sandeep" , "Kavitha" , "Madhu"};

        Test3.printArr(arr);
        Test3.printArr(sarr);
    }


}

class Test {
    static <T> void genericDisplay(T element) {
        System.out.println("From generics " + element);
    }
}

// Generic classes

class Test2<T> {
    T obj;
    Test2(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}

class Test3 {

     static <T> void printArr(T[] arr) {
        for(T ele : arr) {
            System.out.println(ele + " ");
        }
    }

}


