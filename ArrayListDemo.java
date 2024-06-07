import java.io.*;
import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        int size = 5;
        ArrayList<Integer> list1 = new ArrayList<>(size);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        for (int i = 1; i <= size; i++) {
            list1.add(i * 2); // adding multiples of 2 to list1
            list2.add(i * 3); // adding multiples of 3 to list2
        }
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }
}
