package training.java.Arrayex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>(List.of(10,20,50,90,80));

        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(9);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        list1.addAll(list2);
        System.out.println("List1 after adding List2: " + list1);

        list1.addAll(1, list2);
        System.out.println("List1 after adding List2 at index 1: " + list1);

        //Iterating through the list

        Iterator<Integer> itr1= list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();

        while (itr1.hasNext()){
            System.out.println("List1 element: " + itr1.next());
        }
        while (itr2.hasNext()){
            System.out.println("List2 element: " + itr2.next());
        }

    }
}
