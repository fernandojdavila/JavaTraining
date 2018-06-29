package collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTraining {


    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add(", my name");
        linkedList.add(" is");
        linkedList.add(" All Migthy");

        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
        System.out.println();
        System.out.println("----");

        linkedList.forEach( item -> System.out.print(item));
        System.out.println();
        linkedList.add(1, " friend");

        linkedList.forEach( item -> System.out.print(item));
        System.out.println();

        System.out.println(linkedList.lastIndexOf(" is"));

        linkedList.remove(1);

        linkedList.forEach( item -> System.out.print(item));
        System.out.println();

        linkedList.clear();
        System.out.println(linkedList.size());

    }
}
