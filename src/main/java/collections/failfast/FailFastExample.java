package collections.failfast;

import java.util.*;

public class FailFastExample {

    public static void main(String[] args) {
        Map<String, Double> carPrice = new HashMap<>();
        carPrice.put("Porsche", 100000D);
        carPrice.put("Ferrari", 200000D);

        /* Iterate over Map */
        for(Map.Entry<String, Double> car : carPrice.entrySet()){
            System.out.println("Car: " + car.getKey());
            System.out.println("Price: " + car.getValue());

            /* Will cause java.util.ConcurrentModificationException */
            //carPrice.put("Lamborghini", 300000D);
        }

        System.out.println("--------------------------");

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        //This will throw ConcurrentModificationException
        //for(String str : strings) {
            //System.out.println(str);
            //addNewStr(strings, str); Add during the iteration throws ConcurrentModificationException
        //}

        //Some Solutions

        //1. Using an Iterator
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext();){
            if ("two".equals(iterator.next()))
            iterator.add("Added during iteration");
        }

        strings.forEach(item -> System.out.println(item));
        System.out.println("--------------------------");

        //2. If you wan to remove you can use RemoveIf method
        strings.removeIf(item -> item == "Added during iteration");

        strings.forEach(item -> System.out.println(item));


    }

    static void addNewStr(List<String> strings, String str){
        strings.add(str);
    }

    /*
    When you perform add, update or remove on collection while iterating on it.
    It throws java.util.ConcurrentModificationException.

    You can also consider Collection (List, Set, Map) shared between two or more Threads.
    One is iterating on collection and other tries to add element in it then the thread
    iterating over it, will throw java.util.ConcurrentModificationException
     */
}