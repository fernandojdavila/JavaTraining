package collections.list;

import pojos.Game;

import java.util.*;

public class ListsVsSetsTraining {

    public static void main(String[] args) {
        Game g1 = new Game("GTV");
        Game g2 = new Game("Naruto");
        Game g3 = new Game("DBZ");
        Game g4 = new Game("WatchDogs");

        List<Game> gameList = new ArrayList<>();
        Set<Game> gameSet = new HashSet<>();

        gameList.add(g1);
        gameList.add(g2);
        gameList.add(g3);

        System.out.println(gameList);

        gameSet.add(g1);
        gameSet.add(g2);
        gameSet.add(g3);

        System.out.println(gameSet);

        //Adding again g1 to the List
        gameList.add(g1);
        System.out.println(gameList);

        //Adding again g1 to the Set
        gameSet.add(g1);
        System.out.println(gameSet);

        System.out.println("-------Using list iterators------");
        ListIterator listIterator = gameList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("-----Using iterators--------");
        Iterator<Game> gameIterator = gameSet.iterator();
        while (gameIterator.hasNext()){
            System.out.println(gameIterator.next());
        }


        System.out.println("------- Usin Stream ------");
        gameSet.stream().forEach(item -> System.out.println(item));

    }

}
