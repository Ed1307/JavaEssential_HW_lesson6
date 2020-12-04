package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Iterator<Integer> it = arr.iterator();
        Integer index = 0;
        while (it.hasNext()){
        Integer value = it.next();
        arr.set(index, value+1);
        index++;
        }
        System.out.println(arr);
    }
}
