package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main04 {

    public static void main(String[] args) {
        List<City> initialize = Main03.initialize();
        initialize.forEach(System.out::println);
        System.out.println("--------");
        List<City> reverse = reverse(initialize);
        reverse.forEach(System.out::println);

    }

    public static List<City> reverse (List<City> list ){

        List<City> cities = new ArrayList<>();

        ListIterator<City> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()){
            cities.add(iterator.previous());
        }

        return cities;
    }
}
