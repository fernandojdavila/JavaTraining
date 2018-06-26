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
    }
}

