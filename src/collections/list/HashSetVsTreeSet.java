package collections.list;

import pojos.GenericComparablePojo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {

    public static void main(String[] args) {
        GenericComparablePojo pojo = new GenericComparablePojo("Goku");
        GenericComparablePojo pojo2 = new GenericComparablePojo("Picolo");
        GenericComparablePojo pojo3 = new GenericComparablePojo("Vegeta");
        GenericComparablePojo pojo4 = new GenericComparablePojo("Roshi");


        HashSet<GenericComparablePojo> hashSet = new HashSet<>();
        TreeSet<GenericComparablePojo> treeSet = new TreeSet<>();

        hashSet.add(pojo);
        hashSet.add(pojo2);
        hashSet.add(pojo3);

        treeSet.add(pojo2);
        treeSet.add(pojo3);
        treeSet.add(pojo4);

        System.out.println("--------HashSet stores item without order --------------");
        hashSet.stream().forEach(item -> System.out.println(item.getGenericName()));
        System.out.println("--------TreeSet stores items in order because the compareTo method --------");
        treeSet.stream().forEach(item -> System.out.println(item.getGenericName()));

        //Adding NULL vale
        System.out.println("-------- Adding NULL values --------------");
        hashSet.add(null);
        // TreeSet does not allow NULL values
        // treeSet.add(null);
        hashSet.stream().forEach(item -> System.out.println(item != null ? item.getGenericName() : "NULL"));
        System.out.println("-------------------");
        treeSet.stream().forEach(item -> System.out.println(item != null ? item.getGenericName() : "NULL"));

    }
}

