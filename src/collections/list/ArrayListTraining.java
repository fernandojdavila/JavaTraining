package collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTraining {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add(", my name");
        arrayList.add(" is");
        arrayList.add(" All Migthy");

        ListIterator<String> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
        System.out.println();
        System.out.println("----");

        arrayList.forEach( item -> System.out.print(item));
        System.out.println();
        arrayList.add(1, " friend");

        arrayList.forEach( item -> System.out.print(item));
        System.out.println();

        System.out.println(arrayList.lastIndexOf(" is"));

        arrayList.remove(1);

        arrayList.forEach( item -> System.out.print(item));
        System.out.println();

        arrayList.clear();
        System.out.println(arrayList.size());



    }

}
