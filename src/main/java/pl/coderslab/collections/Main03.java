package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<City> initialize = initialize();
        for (City c: initialize){
            System.out.println(c.getName());
        }

        List<City> cities = firstSubList(initialize, 2, 4);

        cities.forEach(System.out::println);
        System.out.println("-----");


        List<City> cities1 = secondSubList(initialize, 0, 3);
        cities1.forEach(System.out::println);

    }

    public static List<City> secondSubList(List<City> list, int start, int end ){
        List<City> cities = new ArrayList<>();

        cities = firstSubList(list,start,end);
        return cities;
    }


    public static List<City> initialize(){
        List<City> cities = new ArrayList<>();

        cities.addAll(Arrays.asList(
                new City("London", 200),
                new City("Lviv",200),
                new City("Warsaw",500),
                new City("Barcelona",600),
                new City("New York",1000)));
        return cities;

    }


    public static List<City> firstSubList(List<City> list, int start, int end ){
        List <City> sublist = new ArrayList<>();

        for(int i =start; i<end;i++){
            sublist.add(list.get(i));
        }
        return sublist;
    }
}
