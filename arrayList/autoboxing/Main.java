package arrayList.autoboxing;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hello");
        arr.add("there!");
        System.out.println(arr);

        //This does not work for primitive data types. ArrayList<int> is not valid since
        //int is a datattype and not a class
        //To solve this, we use autoboxing. The Integer class is used. 
        //Same goes for other data types like Double, Float.

        Integer num = new Integer(5); //Depreciated
        Integer num1 = 8;
        
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(num);
        intArr.add(num1);
        System.out.println(intArr);
    }
}
