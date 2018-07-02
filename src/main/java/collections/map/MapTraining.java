package collections.map;

import pojos.Game;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTraining {

    public static void main(String[] args) {

        // Map implementations
        /*
        1. HashMap
        2. TreeMap
        3. LinkedHashMap
        4. Hashtable
         */

        Game g1 = new Game("GTV");
        Game g2 = new Game("Naruto");
        Game g3 = new Game("DBZ");
        Game g4 = new Game("WatchDogs");

        HashMap<String,Game> hashMap = new HashMap<>();
        TreeMap<String,Game> treeMap = new TreeMap<>();
        LinkedHashMap<String,Game> linkedHashMap = new LinkedHashMap<>();
        Hashtable<String,Game> hashtable = new Hashtable<>();

        //Adding elements

        hashMap.put("One", g1);
        hashMap.put("Two", g2);
        hashMap.put("Three", g3);
        hashMap.put("Four", g4);

        treeMap.put("d.One", g1);
        treeMap.put("c.Two", g2);
        treeMap.put("b.Three", g3);
        treeMap.put("a.Four", g4);

        linkedHashMap.put("One", g1);
        linkedHashMap.put("Two", g2);
        linkedHashMap.put("Three", g3);
        linkedHashMap.put("Four", g4);

        hashtable.put("One", g1);
        hashtable.put("Two", g2);
        hashtable.put("Three", g3);
        hashtable.put("Four", g4);

        System.out.println("----------- HashMap -----------");
        hashMap.entrySet().stream().forEach(item -> System.out.println(item.getValue().getName()));

        System.out.println("----------- TreeMap -----------");
        treeMap.entrySet().stream().forEach(item -> System.out.println(item.getValue().getName()));

        System.out.println("----------- LinkedHashMap -----------");
        linkedHashMap.entrySet().stream().forEach(item -> System.out.println(item.getValue().getName()));

        System.out.println("----------- HashTable -----------");
        hashtable.entrySet().stream().forEach(item -> System.out.println(item.getValue().getName()));


        /*
        Order:
        --------
        HashMap doesn't maintain any order
        TreeMap make a natural order, using the compareTo method based on Key
        LinkedHashMap maintain the same order which the entries were put
        HashTable doesn't maintain any order

        Synchronize:
        ------------
        Only HashTable is internally synchronized the rest of them not.

        Velocity:
        --------
        HashMap provide constant time for get and put operations


        Duplication:
        ------------
        HashMap, TreeMap, LinkedHashMap or HashTable don't allow duplicated key

        Null Values:
        -------------
        HashMap and LinkedHashMap allow null keys, only one
        TreeMap and HashTable don't allow null keys




         */
    }

}
