package collections.list;

import pojos.GenericComparablePojo;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class HashSetVsTreeSetVsLinkedHashSet {

    public static void main(String[] args) {
        GenericComparablePojo pojo = new GenericComparablePojo("Goku");
        GenericComparablePojo pojo2 = new GenericComparablePojo("Picolo");
        GenericComparablePojo pojo3 = new GenericComparablePojo("Vegeta");
        GenericComparablePojo pojo4 = new GenericComparablePojo("Roshi");


        HashSet<GenericComparablePojo> hashSet = new HashSet<>();
        TreeSet<GenericComparablePojo> treeSet = new TreeSet<>();
        LinkedHashSet<GenericComparablePojo> linkedHashSet = new LinkedHashSet<>();

        hashSet.add(pojo);
        hashSet.add(pojo2);
        hashSet.add(pojo3);

        treeSet.add(pojo2);
        treeSet.add(pojo3);
        treeSet.add(pojo4);

        linkedHashSet.add(pojo);
        linkedHashSet.add(pojo2);
        linkedHashSet.add(pojo3);
        linkedHashSet.add(pojo4);

        System.out.println("--------HashSet stores item without order --------------");
        hashSet.stream().forEach(item -> System.out.println(item.getGenericName()));
        System.out.println("--------TreeSet stores items in order because the compareTo method --------");
        treeSet.stream().forEach(item -> System.out.println(item.getGenericName()));
        System.out.println("-------- LinkedHashSet maintain insert order --------");
        linkedHashSet.stream().forEach(item -> System.out.println(item.getGenericName()));


        //Adding NULL vale
        System.out.println("-------- Adding NULL values --------------");
        hashSet.add(null);
        linkedHashSet.add(null);
        // TreeSet does not allow NULL values
        // treeSet.add(null);
        System.out.println("------- HashSet ------------");
        hashSet.stream().forEach(item -> System.out.println(item != null ? item.getGenericName() : "NULL"));
        System.out.println("------- TreeSet  ------------");
        treeSet.stream().forEach(item -> System.out.println(item != null ? item.getGenericName() : "NULL"));
        System.out.println("------- LinkedHashSet  ------------");
        linkedHashSet.stream().forEach(item -> System.out.println(item != null ? item.getGenericName() : "NULL"));


        //HashSet is much faster than TreeSet and also better than LinkedHasSet
        // since HashSet has a constant time performance ad TreeSet has
        // log(n) cost time for add, remove and contains operations.
        //LinkedHashSet is faster than TreeSet and gives a performance of order O(1) for all operations

        //Both are NOT thread safe

        //HashSet uses equals() method for comparision while TreeSet uses compareTo() method for
        // maintaining order and comparision

        //LinkedHasSet need more memory than HashSet and maintain a LinkedList along with HashMap
        // to store elements
        //TreeSet uses more memory than HashSet and also maintain a comparator

    }


    public void whenUsingHeadSet_shouldReturnHeadSetElements() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        Set<Integer> subSet = treeSet.headSet(6);

        assertEquals(subSet, treeSet.subSet(1, 6));
    }


    public void whenUsingTailSet_shouldReturnTailSetElements() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        Set<Integer> subSet = treeSet.tailSet(3);

        assertEquals(subSet, treeSet.subSet(3, true, 6, true));
    }
}

